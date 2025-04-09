package com.selenium.mavenproject1;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample {
	
	private String browser;
	
	public FactoryExample(String browser)
	{
		this.browser=browser;
	}
	
	
  @Test
  public void testMethod() 
  {
	  
	  System.out.println("Running test on browser: "+browser);
  }
  
  @Factory
  public static Object[] factoryMethod()
  {
	  Object[] brw = {
			  
			  new FactoryExample("Chrome"),
			  new FactoryExample("Firefox"),
			  new FactoryExample("Edge"),
	  };
	  return brw;
  }
}
