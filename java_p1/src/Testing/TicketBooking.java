package Testing;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

public class TicketBooking extends data_functions{
		
	Scanner scan = new Scanner(System.in);
	static int bookingid=1;
	
	public void display_route(HashMap<String,busroutes> store)
	{
		System.out.println("Available bus routes");
		
		for(String routeId : store.keySet())
		{
			busroutes b = store.get(routeId);
			System.out.println("Route ID: " + b.routeId + ", Source: " + b.src + ", Destination: " + b.dest +", Total Seats: " + b.totseats + ", Remaining Seats: " + b.remseats + ", Cost per Seat: " + b.cost);
		}
	}
	
	public void book_seat() throws SQLException, ClassNotFoundException 
	{
		while(true)
		{
			System.out.println("Enter the Route Id: (enter 0 to exit)");
			String routeId = scan.next();
			
			 if (routeId.equals("0")) 
			 {
		       System.out.println("Exiting booking...");
		       break;
		     }
			
			 if (!store.containsKey(routeId)) 
			 {
		        System.out.println("Invalid Route ID! Please try again.");
		        continue; 
		     }

			System.out.println("Enter the number of seats required");
			int bookedseats = scan.nextInt();
			System.out.println("Seats reserved successfully");
			busroutes b = store.get(routeId);
			int total = calcbookingamt(b.cost,bookedseats);		
			b.remseats = b.totseats - bookedseats;
			
			String jdbcURL = "jdbc:mysql://localhost:3306/mydb";
	        String dbuname = "root";
	        String dbpwd = "Password@12";

	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpwd);

	        // SQL query to update remseats in the busroute table
	        String updateQuery = "UPDATE busroute SET remseats = ? WHERE routeId = ?";
	        PreparedStatement pstmt = con.prepareStatement(updateQuery);
	        pstmt.setInt(1, b.remseats);
	        pstmt.setString(2, routeId);

	        // Execute the update query
	        pstmt.executeUpdate();
			
			booking bk = new booking(bookingid,bookedseats,total,routeId);
			bookings.put(bookingid,bk);
			bookingid++;
		}
		
	}
	
	public int calcbookingamt(int cost,int bookedseats)
	{
		int amt=cost*bookedseats;
		return amt;
	}

}
