package KB_Mouse_Movements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readfromtable 
{
	public static void main(String[] args)
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/large");
		dr.manage().window().maximize();
		String value = dr.findElement(By.xpath("//tr[@class='row-20']/td[10]")).getText();
		System.out.println(value);
	}
	
}
