package testng_reports_logs;

import org.testng.Reporter;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener
{
	
  @Override
  public void onTestFailure(ITestResult result)
  {
	  Reporter.log("Test Failed : " + result.getName());
  }
  
  @Override
  public void onTestSuccess(ITestResult result)
  {
	  Reporter.log("Test Success : " + result.getName());
  }
  
  @Override
  public void onTestStart(ITestResult result)
  {
	  Reporter.log("Test Start : " + result.getName());
  }
}
