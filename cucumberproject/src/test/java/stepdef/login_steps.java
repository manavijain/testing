package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps extends Utilities.common_methods
{
	@Given("Login page is displayed")
	public void login_page_is_displayed() 
	{
	    launch_chrome ("https://www.saucedemo.com/");
	    System.out.println("The login page is displayed");
	}
	
	@When("the user clicks login link")
	public void the_user_clicks_login_link() 
	{
		dr.findElement(By.xpath("//a[@class='ico-login']")).click();
	}
	
	
	@When("the user enters valid emailid and password")
	public void the_user_enters_valid_emailid_and_password() 
	{
		dr.findElement(By.id("Email")).sendKeys("aghana@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("abc123");
	}
	
	
	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() 
	{
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	
	@Then("home screen is displayed and emailid is displayed")
	public void home_screen_is_displayed_and_emailid_is_displayed() 
	{
		String s = dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/customer/info']")).getText();
		
		System.out.println("Text Read "+s);
		
		if(s.equals("aghana@gmail.com"))
		{
			System.out.println("User with email id "+s+" logged in succesfully");
		}
		else
		{
			System.out.println("Login unsuccesful");
		}
	}
}
