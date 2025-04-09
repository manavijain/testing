package JDBC_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
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
		String q = "select * from s1"; //student table
		//String q1 = "select * from emp"; //dept table
		
		ResultSet rs = stmt.executeQuery(q);
		
		while(rs.next())
		{
			int id = rs.getInt("sid");
			String n = rs.getString("sname");
			System.out.println(id + " "+n);
		}
		con.close();
	}

}
