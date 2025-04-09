package com.selenium.prj1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions2
{
	
	SoftAssert sa;
	
  @Test
  public void test1() 
  {
	  sa = new SoftAssert();
	  
	  sa.assertEquals(true,true);							//both are true so test case passed
	  System.out.println("in test1");
	  sa.assertAll();
  }
  
  @Test
  public void test2()
  {
	  sa = new SoftAssert();
	  
	  sa.assertEquals(false,true);			//test case failed but the statement next to it is printed bcz of SoftAssert 
	  System.out.println("in test2");
	  sa.assertAll();
  }
  
  @Test
  public void test3()
  {
	  sa = new SoftAssert();
	  
	  sa.assertEquals(false,false);			//both are false so test case passed
	  System.out.println("in test3");
	  sa.assertAll();
  }
}
