package com.selenium.prj1;

import org.testng.annotations.Test;

public class new_group
{
  @Test(groups = {"F1", "F2"})
  public void sanityTest1() 
  {
	  System.out.println("Executing F1 and F2 test cases");
  }
  
  @Test(groups = {"F1"})
  public void regressionTest1() 
  {
	  System.out.println("Executing F1 test case");
  }
  
  @Test(groups = {"F2"})
  public void sanityTest2() 
  {
	  System.out.println("Executing F2 test case");
  }
  
  @Test(groups = {"F1"})
  public void regressionTest2() 
  {
	  System.out.println("Executing F1 test case");
  }
  
}
