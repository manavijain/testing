package JDBC_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_data {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		//Database credentials
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb";
		String dbuname = "root";
		String dbpwd = "Password@12";
				
		//Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
		Connection con = DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
	
		String q = "insert into student(sid, sname, marks) values(?,?,?);";
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setInt(1,130);
		pstmt.setString(2,"Vijay");
		pstmt.setInt(3,100);
		
		//Execute a Query
		int rowinserted = pstmt.executeUpdate();
		if(rowinserted > 0)
		{
			System.out.println("A new employee was inserted successfully");
		}
		con.close();
	}

}
