package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginscript {
	
	WebDriver dr = new ChromeDriver();
		
	public String validlogin(String uname,String pwd)
	{		
		dr.get("https://www.saucedemo.com");
		dr.findElement(By.id("user-name")).sendKeys(uname);
		dr.findElement(By.name("password")).sendKeys(pwd);
		dr.findElement(By.id("login-button")).click();
	
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		System.out.println("Text Read "+s);
		
		
		if(s.equals("Products"))
		{
			System.out.println("The actual text is same as expected.");
		}
		else
		{
			System.out.println("The actual text is not same as expected.");
		}
		System.out.println();
		String failtest= "Product";
		if(!s.equals(failtest))
		{
			System.out.println("Expected output: "+failtest);
			System.out.println("Test case failed");
		}
		return s;
	}
	
	public String invalidlogin(String uname,String pwd,String expmsg)
	{
		dr.get("https://www.saucedemo.com");
		dr.findElement(By.id("user-name")).sendKeys(uname);
		dr.findElement(By.name("password")).sendKeys(pwd);
		dr.findElement(By.id("login-button")).click();
		
		WebElement error= dr.findElement(By.xpath("//h3[@data-test='error']"));
		String actualerror = error.getText();
		
		System.out.println();
		
		if (actualerror.equals(expmsg))
		{
	        System.out.println("Error message matches expected message.");
	        System.out.println("Test case passed");
	    } 
		else
		{
	        System.out.println("Error message does not match expected message.");
	        System.out.println("Test case failed");
	    }
		return actualerror;
	}
}
