package Baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class common_methods 
{
	public static WebDriver dr;
	
	public static void launch_chrome(String url)
	{
		dr = new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
	
	public static void launch_edge(String url)
	{
		dr = new EdgeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}	
	
	public static void screenshot() throws IOException 
	{
		TakesScreenshot ss=((TakesScreenshot)dr);
		File srcf=ss.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\mmanavi.jain\\Documents\\2630648 - Manavi\\test1.png");
		FileUtils.copyFile(srcf,destfile);
	}
	
	public static void screenshot1() throws IOException 
	{
		TakesScreenshot ss=((TakesScreenshot)dr);
		File srcf=ss.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\mmanavi.jain\\Documents\\2630648 - Manavi\\test2.png");
		FileUtils.copyFile(srcf,destfile);
	}	
}
