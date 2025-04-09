package Adv_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class jse1 {

	public static void main(String[] args) 
	{
		 WebDriver dr = new EdgeDriver(); 
		 dr.get("https://demowebshop.tricentis.com/");
		 dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		 dr.findElement(By.id("Email")).sendKeys("aghana@gmail.com");
		 dr.findElement(By.id("Password")).sendKeys("abc123");
		 dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		 
		 //WebElement we1 = dr.findElement(By.xpath("//div[@class='header-links']/ul/li/a[@href='login']"));
		 
		 //jse.execeuteScript("arguments[0].click();" , we)
		 
		 JavascriptExecutor jse = (JavascriptExecutor) dr;
		 jse.executeScript("window.scrollBy(0,400)");

	}

}
