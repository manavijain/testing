package Adv_Features;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class screenshot1 {

	public static void main(String[] args) throws IOException 
	{
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		
		TakesScreenshot ss = ((TakesScreenshot) dr);
		File srcf = ss.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("C:\\Users\\mmanavi.jain\\Documents\\2630648 - Manavi\\screenshot.png");
		FileUtils.copyFile(srcf, destfile);

	}

}
