package com.selenium.prj1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovidereg extends common_methods
{
	@DataProvider(name = "logindata")
	public Object[][] getdata()
	{
		Object[][] testdata = new Object[][]
				{
					{"user1" , "pwd1"},
					{"user2" , "pwd2"},
					{"user3" , "pwd3"},
					{"user4" , "pwd4"}
				};
		return testdata;
	}
	
	
  @Test(dataProvider = "logindata")
  public void testlogin(String uid, String pwd) 
  {
	  System.out.println("User ID : "+uid+" Password: "+pwd);
  }
}
