package Tests;

import org.testng.annotations.Test;

import com.selenium.prj1.common_methods;

import POM_Pages.login_page;
import POM_Pages.products_page;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest1 extends common_methods
{
	login_page lp;
	products_page pp;
	
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  launch_chrome("https://www.saucedemo.com");
		lp = new login_page(dr);
		pp = new products_page(dr);
  }
 

  @AfterMethod
  public void afterMethod() throws IOException		
  {
	  dr.close();
  }
  
  @Test
  public void test1()
  {
	  lp.enter_uname("standard_user");
	  lp.enter_pwd("secret_sauce");
	  lp.click_login();
	  String atitle = pp.get_title();
	  Assert.assertEquals("Products", atitle);
  }
  
  @Test
  public void test2()
  {
	  lp.enter_uname("standard_user");
	  lp.enter_pwd("secret_sauce");
	  lp.click_login();
	  String atitle = pp.get_title();
	  Assert.assertEquals("Products1", atitle);
  }

}
