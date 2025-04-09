package KB_Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) 
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/checkboxradio/");
		dr.manage().window().maximize();
		
		WebElement iframe = dr.findElement(By.xpath("//iframe"));
		dr.switchTo().frame(iframe);
		dr.findElement(By.xpath("//label[@for='radio-3']/span[1]")).click();
		
		dr.findElement(By.xpath("//label[@for='checkbox-3']/span[1]")).click();
		dr.findElement(By.xpath("//label[@for='checkbox-4']/span[1]")).click();

	}

}
