package JDBC_Connect;

public class Student {
	 
	int sid;
	String sname;
	int phy,chem;
	float avg;
	
	Student(int i,String n,int p,int c)
	{
		this.sid=i;
		this.sname=n;
		this.phy=p;
		this.chem=c;
	}
	float avg(int p,int c)
	{
		this.avg = (this.phy + this.chem) / 2.0f;
        return this.avg;
		
	}
}
