package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class shopping {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
		dr.findElement(By.id("pollanswers-1")).click();
		dr.findElement(By.id("vote-poll-1")).click();
		
		dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		dr.findElement(By.id("Email")).sendKeys("aghana@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("abc123");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		String s = dr.findElement(By.xpath("//a[@class='account']")).getText();
		
		System.out.println("Text Read "+s);
		
		if(s.equals("aghana@gmail.com"))
		{
			System.out.println("User with email id "+s+" logged in succesfully");
		}
		else
		{
			System.out.println("Login unsuccesful");
		}
		
		//dr.findElement(By.xpath("//input[@type='button']")).click();
		
		//dr.findElement(By.xpath("//a[@href='/books']")).click(); 
		
		dr.findElement(By.xpath("//div[@class='block block-category-navigation']/div[2]//a[@href='/books']")).click();
		
		WebElement we1 = dr.findElement(By.name("products-orderby"));
		Select sel = new Select(we1);
		
		sel.selectByContainsVisibleText("Name: A");
		
	}

}
