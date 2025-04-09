package testng_reports_logs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener1.class)
public class listener_report 
{
	
  @Test
  public void test1() 
  {
	  Reporter.log("Executing test1 method");
	  
	  Assert.assertTrue(true);
  }
  
  @Test
  public void test2()
  {
	  Reporter.log("Executing test2 method");
	  
	  Assert.assertTrue(false);
  }
}
