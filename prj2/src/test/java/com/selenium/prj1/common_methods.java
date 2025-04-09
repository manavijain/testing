package com.selenium.prj1;

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

}
