package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		dr.manage().window().maximize();
		
		WebElement element = dr.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']//button[@id='alertButton']"));
		element.click();
		
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		Alert a = dr.switchTo().alert();
		String alert_msg = a.getText();
		System.out.println("Alert Message : "+ alert_msg);
		
		a.accept();			//to click on ok button when alert msg appears
		//a.dismiss();		////to click on cancel button when alert msg appears

	}

}
