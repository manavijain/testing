package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwait1 {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/books");
		
		String xp = "//input[@type='text']";
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(dr)
			.withTimeout(Duration.ofSeconds(10))
			.pollingEvery(Duration.ofMillis(500))
			.ignoring(NoSuchElementException.class);
			
		WebElement wel = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));
		wel.click();
		
	}
}
