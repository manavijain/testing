package Testing;

import java.sql.SQLException;

public class booking_main extends data_functions{

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	  
		TicketBooking tb = new TicketBooking();
		tb.getdata();
		tb.display_route(store);
		tb.book_seat();
		tb.putdata(bookings);
	
		System.out.println("\nCurrent Bookings:");
        for (int bookingId : bookings.keySet()) 
        {
            booking bk = bookings.get(bookingId);
            System.out.println("Booking ID: " + bk.bookingid + ", Route ID: " + bk.routeId +", Seats Booked: " + bk.noofseats + ", Total Amount: " + bk.totalamt);
        }
	}

}
