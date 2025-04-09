package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryweb {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/");
		
		dr.findElement(By.xpath("//*[text()='Checkboxradio']")).click();
		//*[text()='Checkboxradio']
		//*[contains(text(),'radio']
		
		WebElement we1 = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
		dr.switchTo().frame(we1);
		dr.findElement(By.xpath("//div[@class='widget']/fieldset[1]/label[@for='radio-1']/span[1]")).click();
		

	}

}
