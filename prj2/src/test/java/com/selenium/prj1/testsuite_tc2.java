package com.selenium.prj1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testsuite_tc2
{
	 WebDriver dr = new EdgeDriver(); 
	 
	@BeforeClass
	public void login()
	{
		dr.get("https://demowebshop.tricentis.com/");
		dr.findElement(By.xpath("//a[@class='ico-login']")).click();
		dr.findElement(By.id("Email")).sendKeys("aghana@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("abc123");
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
  @Test
  public void test2() 
  {
	  LocalDateTime myDateObj = LocalDateTime.now();
	  DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	  String formattedDate = myDateObj.format(myFormatObj);
	  System.out.println("in test2 - After formatting: "+formattedDate);
  }
  
}
