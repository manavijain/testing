package stepdef;

import org.testng.Assert;

import POM_Pages.login_page;
import POM_Pages.products_page;
import Utilities.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps extends baseclass
{
	login_page lp;
	products_page pp;
	
	@Given("The login page is displayed")
	public void the_login_page_is_displayed() 
	{
	    launch_chrome("https://www.saucedemo.com/");
	    
	    lp=new login_page(dr);
	}
	
	
	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_and_password() 
	{
	    lp.enter_uname("standard_user");    
	    lp.enter_pwd("secret_sauce");
	}
	
	
	@When("user clicks login button")
	public void user_clicks_login_button() 
	{
	    lp.click_login();
	}
	
	
	@Then("the user is navigated to the home screen and {string} should be displayed on homescreen")
	public void the_user_is_navigated_to_the_home_screen_and_should_be_displayed_on_homescreen(String string) 
	{
		pp = new products_page(dr);
	    String p =pp.get_title();
	    Assert.assertEquals(p,"Products");
	}
}
