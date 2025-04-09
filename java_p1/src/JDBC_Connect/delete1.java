package JDBC_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//Database credentials
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb";
		String dbuname = "root";
		String dbpwd = "Password@12";
						
		//Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		//Establish connection
		Connection con = DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		
		String updatesql = "delete from student where sid = ? ";
		PreparedStatement pstmt = con.prepareStatement(updatesql);
		
		pstmt.setInt(1,110);
		
		//Execute a query
		int rowsDeleted = pstmt.executeUpdate();
		if(rowsDeleted > 0)
		{
			System.out.println("A new employee was deleted successfully");
		}
		con.close();
	}

}
