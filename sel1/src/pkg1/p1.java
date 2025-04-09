package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	
	public static void main(String[] args)
	{
		WebDriver dr = new ChromeDriver();
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
		else
		{
			System.out.println("The actual text is not same as expected.");
		}
	}

}
