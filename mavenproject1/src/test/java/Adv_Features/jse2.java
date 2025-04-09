package Adv_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class jse2 {

	public static void main(String[] args)
	{
		 WebDriver dr = new EdgeDriver(); 
		 dr.get("https://demowebshop.tricentis.com/");
		 dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		 
		 JavascriptExecutor jse = (JavascriptExecutor) dr;
		 
		 WebElement we1 = dr.findElement(By.id("Email"));
		 //WebElement we1 = dr.findElement(By.xpath("//div[@class='header-links']/ul/li//a"));
		 jse.executeScript("arguments[0].value='aghana@gmail.com';" , we1);
		 
		 //jse.executeScript("window.scrollBy(0,200)");
		 
	}

}
