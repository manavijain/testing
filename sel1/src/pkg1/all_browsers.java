package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class all_browsers {

	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.flipkart.com");
		
		WebDriver dr2 = new EdgeDriver();
		dr2.get("https://www.flipkart.com");
		
		WebDriver dr3 = new FirefoxDriver();
		dr3.get("https://www.flipkart.com");

	}

}
