package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample1 {
	
	private String browser;
	WebDriver dr;
	
	public FactoryExample1(String browser)
	{
		this.browser=browser;
	}
	
	@Test
	public void testMethod() 
	{
		  switch(browser)
		  {
			  case "Chrome" : System.out.println("Running test on browser: "+browser);
			  				  dr = new ChromeDriver();
			  				  break;
			  				  
			  case "Edge" : System.out.println("Running test on browser: "+browser);
				  			dr = new EdgeDriver();
				  			break;
				  
			  case "Firefox" : System.out.println("Running test on browser: "+browser);
							   dr = new FirefoxDriver();
							   break;
		  }
	}
	
	@AfterMethod
	public void launch()
	{
		dr.get("https://www.saucedemo.com");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.name("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
	
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		System.out.println("Text Read "+s);
		
		
		if(s.equals("Products"))
		{
			System.out.println("The actual text is same as expected.");
		}
	}
  
	@Factory
	public static Object[] factoryMethod()
	{
		Object[] brw = {
			  
				  new FactoryExample1("Chrome"),
				  new FactoryExample1("Firefox"),
				  new FactoryExample1("Edge"),
		  };
		  return brw;
	}
}
