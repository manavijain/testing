package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwait 
{
	public static void main(String[] args)
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
		
		String xp = "//input[@type='text']";
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(dr)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				
			WebElement wel = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));
			wel.sendKeys("Selenium");
			dr.quit();
	}	
}
