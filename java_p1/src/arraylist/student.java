package arraylist;

public class student {
	String name;
	int id;
	
	
	student(String name,int id)
	{
		this.name=name;
		this.id=id;	
	}
		
	void display()
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student Id: "+id);	
	}
}
