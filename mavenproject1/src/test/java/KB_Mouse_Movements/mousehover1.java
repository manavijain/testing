package KB_Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover1 {

	public static void main(String[] args) 
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.myntra.com/");
		dr.manage().window().maximize();
		
		WebElement menu = dr.findElement(By.xpath("//div[@class='desktop-userIconsContainer']"));
		
		Actions act = new Actions(dr);
		act.moveToElement(menu).perform();		//hover over menu
		
	}

}
