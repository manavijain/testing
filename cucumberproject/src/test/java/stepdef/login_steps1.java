package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps1 extends Utilities.common_methods
{
	
	@When("user clicks login button")
	public void user_clicks_login_button() 
	{
		dr.findElement(By.id("login-button")).click();
	}
	
	
	@Then("the user is navigated to the home screen and {string} should be displayed on homescreen")
	public void the_user_is_navigated_to_the_home_screen_and_should_be_displayed_on_homescreen(String string)
	{
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		System.out.println("Text Read "+s);
		
		Assert.assertEquals("Products",s);
	}
	
}
