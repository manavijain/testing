package com.selenium.prj1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency1
{
  @Test
  public void login() 
  {
	  System.out.println("In Login method");
	  Assert.assertEquals(true, true);
  }
  
  @Test(dependsOnMethods = "login")
  public void verifyDashboard()
  {
	  System.out.println("Dashboard Verification Passed");
  }
}
