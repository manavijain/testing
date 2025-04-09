package KB_Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) 
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/drag-and-drop");
		dr.manage().window().maximize();
		
		Actions act = new Actions(dr);
		WebElement c1 = dr.findElement(By.id("column-a"));
		WebElement c2 = dr.findElement(By.id("column-b"));
		act.dragAndDrop(c1, c2).perform();

	}

}
