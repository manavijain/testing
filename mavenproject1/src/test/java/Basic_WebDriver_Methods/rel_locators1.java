package Basic_WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

import Utilities.common_methods;

public class rel_locators1 extends common_methods
{

	public static void main(String[] args) 
	{
		launch_edge("https://www.saucedemo.com/");
		
		By emaillocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		dr.findElement(emaillocator).sendKeys("standard_user");
		
		By passwdlocator = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		dr.findElement(passwdlocator).sendKeys("secret_sauce");

	}

}
