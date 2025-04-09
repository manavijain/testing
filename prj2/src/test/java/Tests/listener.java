package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class listener implements ITestListener
{
	WebDriver dr;
	
	public listener()
	{
		this.dr = new ChromeDriver();
	}
	
	@Override
	  public void onTestFailure(ITestResult result)
	  {
		Reporter.log("Test Failed: " + result.getName());	
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
