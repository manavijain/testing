package com.selenium.prj1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterizationeg 
{
  @Test
  //@org.testng.annotations.Parameters({"OS"})
  
  @Parameters
  public void testwithparameters(String OS) 
  {
	  System.out.println("Running test on OS : "+OS);
  }
}
