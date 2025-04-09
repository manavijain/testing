package KB_Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class kbs {

	public static void main(String[] args) 
	{
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.saucedemo.com/");
		
		WebElement we1 = dr.findElement(By.xpath("//*[@id=\"user-name\"]"));
		dr.manage().window().maximize();
		
		Actions act = new Actions(dr);
		
		act 
		.sendKeys(we1, "hello")
		.keyDown(Keys.CONTROL)
		.sendKeys("acvv")
		.keyUp(Keys.CONTROL)
		.perform();

	}

}
