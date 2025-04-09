package stepdef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps2 extends Utilities.common_methods
{
	@Given("The login page is displayed")
	public void the_login_page_is_displayed() 
	{
		launch_chrome ("https://www.saucedemo.com/");
	    System.out.println("The login page is displayed");
	}

	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String uid, String pwd) 
	{
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uid);
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd); 
	}
	
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button()
	{
		dr.findElement(By.id("login-button")).click();
	}
	
	
	@Then("The application should display the message \"(.*)\"$")
	public void the_application_should_display_the_message(String emsg) 
	{
		System.out.println(emsg);
		
		if(emsg.equals("Products"))
		{
			String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
			System.out.println("Text Read "+s);
		}
		else
		{
			System.out.println(emsg);
		}
	}
}
