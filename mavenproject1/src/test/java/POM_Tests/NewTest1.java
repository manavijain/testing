package POM_Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Pages.login_page;
import POM_Pages.products_page;

public class NewTest1 extends Utilities.common_methods
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
  public void afterMethod()
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
