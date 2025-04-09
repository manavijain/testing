package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait2 
{
	public static void main(String[] args)
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
		
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(20000));
		WebElement ele3 = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']"))) ;
		ele3.sendKeys("standard_user");
		dr.quit();		
	}
	
}



