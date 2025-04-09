package stepdef1;

import org.openqa.selenium.By;
import Utilities.common_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cart extends common_methods
{

	@Given("login is successful")
	public void login_is_successful() 
	{
		login.login_page_is_displayed() ;
	    login.the_user_clicks_login_link();
	    login.the_user_enters_valid_emailid_and_password();
	    login.the_user_clicks_on_login_button();
	}
	
	@When("click on books")
	public void click_on_books() 
	{
	    dr.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/books']")).click();
	}
	
	
	@When("click the book to be purchased")
	public void click_the_book_to_be_purchased()
	{
		dr.findElement(By.xpath("//div[@class='details']//a[@href='/computing-and-internet']")).click();
	}
	
	@When("add to cart button is clicked in product page")
	public void add_to_cart_button_is_clicked_in_product_page() 
	{
		dr.findElement(By.xpath("//div[@class='add-to-cart-panel']//input[@class='button-1 add-to-cart-button']")).click();
	}
	
	
	@When("click on shopping cart")
	public void click_on_shopping_cart() 
	{
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/cart']")).click();
	}
	
	
	@Then("product name is displayed")
	public void product_name_is_displayed() 
	{
	    String pname = dr.findElement(By.xpath("//td[@class='product']//a[@href='/computing-and-internet']")).getText();
	    if(pname.equals("Computing and Internet"))
	    {
	    	System.out.println("The product is added to the cart successfully");
	    }
	    else
	    {
	    	System.out.println("The product is not added to the cart");
	    }  
	}
}
