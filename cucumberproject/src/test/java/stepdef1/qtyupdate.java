package stepdef1;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.common_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class qtyupdate extends common_methods
{
	cart c = new cart();
	
	double amt1,amt2;
	
	@Given("^login is successful and book section is clicked$")
	public void login_is_successful_and_book_section_is_clicked() 
	{
		login.login_page_is_displayed() ;
	    login.the_user_clicks_login_link();
	    login.the_user_enters_valid_emailid_and_password();
	    login.the_user_clicks_on_login_button();
	    
	    c.click_on_books();
	}

	
	@When("add multiple products to the cart")
	public void add_multiple_products_to_the_cart() 
	{
		c.click_the_book_to_be_purchased();
		c.add_to_cart_button_is_clicked_in_product_page();
		
		dr.findElement(By.xpath("//div[@data-productid='45']//h2[@class='product-title']//a[@href='/fiction']")).click();
		c.add_to_cart_button_is_clicked_in_product_page();
	}
		
	@When("click on shopping cart and check the subtotal")
	public void click_on_shopping_cart_and_check_the_subtotal() 
	{
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/cart']")).click();
		
		String s = dr.findElement(By.xpath("//table/tbody/tr[1]/td[2]/span/span[@class='product-price']")).getText();
		amt1 = Double.parseDouble(s);
		Assert.assertEquals(amt1, 34.0);
	}
	
	
	@When("remove a product from the cart")
	public void remove_a_product_from_the_cart() 
	{
	    dr.findElement(By.xpath("//table/tbody/tr[2]/td[1]/input[@name='removefromcart']")).click();	//to click checkbox
	    
	    dr.findElement(By.xpath("//div[@class='buttons']//input[@name='updatecart']")).click();			//to click update cart button
	}
	
	
	@When("check subtotal again")
	public void check_subtotal_again() 
	{
	    String s1 = dr.findElement(By.xpath("//tr[1]/td[2]/span/span[@class='product-price']")).getText();
	    amt2 = Double.parseDouble(s1);
		Assert.assertEquals(amt2, 10.0);
	}
	
	
	@Then("the product should be removed and the amount should be updated")
	public void the_product_should_be_removed_and_the_amount_should_be_updated() 
	{
	    if(amt1 != amt2)
	    {
	    	System.out.println("The product has been succesfully removed from the cart");
	    }
	}
}


