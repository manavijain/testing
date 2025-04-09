package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Baseclass.common_methods;
import POM_Pages.login_page;
import POM_Pages.products_page;


@Listeners(listener.class)
public class listenerTest extends common_methods
{
    login_page lp;
    products_page pp;
    
    @BeforeMethod
    public void setup()
    {
        launch_chrome("https://www.saucedemo.com/");
        lp = new login_page(dr);
        pp = new products_page(dr);
    }
    
    @Test
    public void test1() {
    	Reporter.log("Executed Test1 Method");
    	lp.enter_uname("standard_user");
    	lp.enter_pwd("secret_sauce");
    	lp.click_login();
    	String atitle=pp.get_title();
    	Assert.assertEquals("Products", atitle);
    }
    @Test
    public void test2() throws IOException {
    	Reporter.log("Executed Test2 Method");
    	lp.enter_uname("standard_user");
    	lp.enter_pwd("secret_sauce");
    	lp.click_login();
    	screenshot() ;
    	String atitle=pp.get_title();
    	Assert.assertEquals("Product", atitle);
    }
    @Test
    public void test3() throws IOException {
    	Reporter.log("Executed Test3 Method");
    	lp.enter_uname("standard_user");
    	lp.enter_pwd("secret");
    	lp.click_login();
    	screenshot1();
    	//String atitle=pp.get_title();
    	
    }
 
}













