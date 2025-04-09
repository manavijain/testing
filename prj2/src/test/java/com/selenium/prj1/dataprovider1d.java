package com.selenium.prj1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1d 
{
	
	@DataProvider(name = "testdata")
	public Object[] getdata()
	{
		Object[] testdata = new Object[]
				{
					"user1", "user2", "user3", "user4"
				};
		return testdata;

	}
	
	@Test(dataProvider = "testdata")
	  public void testlogin(String uid) 
	  {
		  System.out.println("User ID : "+uid);
	  }
}
