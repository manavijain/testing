package KB_Mouse_Movements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovements {

	public static void main(String[] args) 
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/context-menu");
		dr.manage().window().maximize();
		WebElement ele = dr.findElement(By.id("hot-spot"));
		
		Actions act = new Actions(dr);
		act.contextClick(ele).perform();
		
		Alert alert = dr.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert Message : "+ text);
		alert.accept();
	}

}
