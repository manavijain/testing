package stepdef1;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.common_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amtverify extends common_methods
{
	cart c = new cart();
	double amt1,amt2;
	
	@Given("cart page is displayed")
	public void cart_page_is_displayed() throws InterruptedException 
	{
		login.login_page_is_displayed() ;
	    login.the_user_clicks_login_link();
	    login.the_user_enters_valid_emailid_and_password();			//login 
	    login.the_user_clicks_on_login_button();
	    
	    c.click_on_books();
	    
	    c.click_the_book_to_be_purchased();							//adding book to the cart
		c.add_to_cart_button_is_clicked_in_product_page();
	}
	
	
	@When("the quantity of product is updated")
	public void the_quantity_of_product_is_updated() 
	{
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/cart']")).click();
	    dr.findElement(By.xpath("//table/tbody/tr/td[5]/input")).clear();				//clearing the existing quantity value
	    dr.findElement(By.xpath("//table/tbody/tr/td[5]/input")).sendKeys("10");		//changing quantity
	    dr.findElement(By.xpath("//div[@class='buttons']//input[@name='updatecart']")).click();	//to click update cart button
	}
	
	
	@Then("the total amount is verified")
	public void the_total_amount_is_verified() 
	{
		String s = dr.findElement(By.xpath("//table/tbody/tr[1]/td[2]/span/span[@class='product-price']")).getText();
		amt1 = Double.parseDouble(s);
		Assert.assertEquals(amt1, 100.0);
		
		String s1 = dr.findElement(By.xpath("//table/tbody/tr/td[6]/span[2]")).getText();
		amt2 = Double.parseDouble(s1);
		Assert.assertEquals(amt2, 100.0);
		
		if(amt1 == amt2)
		{
			System.out.println("Amount verified successfully");
		}
		else
		{
			System.out.println("Amount verification failed");
		}
	}
}
