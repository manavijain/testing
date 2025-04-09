package Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


public class data_functions {
	
	static HashMap<String,busroutes> store = new HashMap<String,busroutes>();
	static HashMap<Integer,booking> bookings = new HashMap<Integer,booking>();
	
	public void getdata() throws SQLException, ClassNotFoundException {
			
			//Database credentials
			String jdbcURL = "jdbc:mysql://localhost:3306/mydb";
			String dbuname = "root";
			String dbpwd = "Password@12";
					
			//Load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish connection
			Connection con = DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
			//create a statement
			Statement stmt = con.createStatement();
			//Execute a query
			String q = "select * from busroute"; 
			
			ResultSet rs = stmt.executeQuery(q);
			
			while(rs.next())
			{
				String routeId = rs.getString("routeId");
				String src = rs.getString("src");
				String dest = rs.getString("dest");
				int totseats=rs.getInt("totseats");
				int remseats=rs.getInt("remseats");
				int cost=rs.getInt("cost");
				
				busroutes b = new busroutes(routeId,src,dest,totseats,remseats,cost);
				store.put(routeId,b);
			}
			con.close();
		}
	
	public void putdata(HashMap<Integer,booking> bookings) throws SQLException, ClassNotFoundException {
		
		//Database credentials
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb";
		String dbuname = "root";
		String dbpwd = "Password@12";
						
		//Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
								
		//Establish connection
		Connection con = DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
						
		String q = "insert into booking(bookingid,noofseats,totalamt,routeId) values(?,?,?,?);";
		PreparedStatement pstmt = con.prepareStatement(q);
		
	    for (int bookingid : bookings.keySet()) 
	    {
	        booking bk = bookings.get(bookingid); 
	        pstmt.setInt(1, bk.bookingid);
	        pstmt.setInt(2, bk.noofseats);
	        pstmt.setInt(3, bk.totalamt);
	        pstmt.setString(4,bk.routeId); 
	        pstmt.executeUpdate();
	    }
        pstmt.close();
        con.close();
	}
}
