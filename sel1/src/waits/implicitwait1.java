package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait1 {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://saucedemo.com/");
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//dr.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		dr.findElement(By.id("user-name")).sendKeys("asdf");

	}

}
