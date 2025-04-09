package Comparable;

public class student implements Comparable<student>{
	
	public String sname;
	public int id;
	public int age;
	
	public student(String name,int id,int age)
	{
		this.sname=name;
		this.id = id;
		this.age = age;
	}
	
	public void display()
	{
		System.out.println(sname+" "+id+" "+age);
	}
	
	//override
	public int compareTo(student s)
	{
		//return s.age - this.age;	//descending order
		return this.age - s.age;	//ascending order
	}
	
	
}
