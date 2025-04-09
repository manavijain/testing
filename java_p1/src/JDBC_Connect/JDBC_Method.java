package JDBC_Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class JDBC_Method{
	
	static HashMap<Integer,Student> store = new HashMap<Integer,Student>();
	
	public void insertStudent(int sid, String sname, int phy, int chem) throws SQLException, ClassNotFoundException {
		
		//Database credentials
		String jdbcURL = "jdbc:mysql://localhost:3306/stddata";
		String dbuname = "root";
		String dbpwd = "Password@12";
				
		//Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
						
		//Establish connection
		Connection con = DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
				
		String q = "insert into Student(sid,sname,phy,chem) values(?,?,?,?);";
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setInt(1, sid);
        pstmt.setString(2, sname);
        pstmt.setInt(3, phy);
        pstmt.setInt(4, chem);
        pstmt.executeUpdate();
        
        pstmt.close();
        con.close();
	}
	
	public void readStudent() throws SQLException, ClassNotFoundException {
		
		//Database credentials
		String jdbcURL = "jdbc:mysql://localhost:3306/stddata";
		String dbuname = "root";
		String dbpwd = "Password@12";
				
		//Load the JDBC driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish connection
		Connection con = DriverManager.getConnection(jdbcURL,dbuname,dbpwd);
		//create a statement
		Statement stmt = con.createStatement();
		//Execute a query
		String q = "select * from Student"; 
		
		ResultSet rs = stmt.executeQuery(q);
		
		while(rs.next())
		{
			int sid = rs.getInt("sid");
			String n = rs.getString("sname");
			int p=rs.getInt("phy");
			int c=rs.getInt("chem");
			
			Student s = new Student(sid,n,p,c);
			store.put(sid,s);
		}
		con.close();
	}
	
	public void avganddisplay() {
        for (Student student : store.values()) {
            float average = student.avg(student.phy, student.chem);	//calculating avg
            System.out.println("Student ID: " + student.sid + ", Name: " + student.sname + ", Average Marks: " + average);
        }
	}
}
