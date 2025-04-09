package KB_Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 
{

	public static void main(String[] args) 
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/selectmenu/");
		dr.manage().window().maximize();
		
		WebElement iframe = dr.findElement(By.xpath("//iframe"));
		dr.switchTo().frame(iframe);
		WebElement speed = dr.findElement(By.className("ui-selectmenu-icon ui-icon ui-icon-triangle-1-s"));
		Select s1 = new Select(speed);
		s1.selectByContainsVisibleText("Slow");
		//s1.selectByIndex(1);

	}

}
