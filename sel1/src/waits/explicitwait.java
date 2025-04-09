package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait 
{
	public static void main(String[] args)
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//form[@id='checkbox-example']/button")).click();
		
		WebDriverWait wt = new WebDriverWait(dr,Duration.ofMillis(5000));
		
		WebElement ele1 = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']/button")));
		if(ele1.isDisplayed())
		{
			ele1.click();
		}
		
		
		WebElement ele2 = wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='checkbox-example']//input[@type='checkbox']")));
		if(ele1.isDisplayed())
		{
			ele2.click();
		}		
		dr.close();	
	}
}
