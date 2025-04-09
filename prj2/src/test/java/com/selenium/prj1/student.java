package com.selenium.prj1;

public class student 
{
	int sid,maths,phy;
	double avg;
	String sname,sem;
	
	public student(int sid, int maths, int phy, String sname, String sem)
	{
		this.sid=sid;
		this.maths=maths;
		this.phy=phy;
		this.sname=sname;
		this.sem=sem;
		this.avg=calcavg();
	}

	public double calcavg() 
	{
		return (maths+phy)/2;
	}
}
