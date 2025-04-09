package Adv_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse_login {

	public static void main(String[] args) 
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) dr;
		
		jse.executeScript("arguments[0].click();", dr.findElement(By.id("login-button")));

	}

}
