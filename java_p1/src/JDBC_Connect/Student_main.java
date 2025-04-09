package JDBC_Connect;

import java.sql.SQLException;

public class Student_main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		JDBC_Method jdbc = new JDBC_Method();
		
		jdbc.insertStudent(100, "Avani", 78, 66);
        jdbc.insertStudent(101, "Chandra", 94, 71);
        jdbc.insertStudent(102, "Dhwani", 44, 62);
        jdbc.insertStudent(103, "Jagadish", 40, 74);
        
        System.out.println("All records inserted successfully.");
        
        jdbc.readStudent();
        
        jdbc.avganddisplay();
	}

}
