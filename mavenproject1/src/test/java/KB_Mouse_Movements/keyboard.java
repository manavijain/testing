package KB_Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard 
{

	public static void main(String[] args) 
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		Actions act = new Actions(dr);
		WebElement username = dr.findElement(By.id("user-name"));
		act.sendKeys(username, "ASDqwe").perform();		
	}

}
