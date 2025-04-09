package stepdef1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.common_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout extends common_methods
{
	cart c = new cart();
	
	@Given("Products in the cart are displayed")
	public void products_in_the_cart_are_displayed() 
	{
		login.login_page_is_displayed() ;
	    login.the_user_clicks_login_link();
	    login.the_user_enters_valid_emailid_and_password();			//login 
	    login.the_user_clicks_on_login_button();
	    
	    WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='block block-category-navigation']//a[@href='/books']")));
	    element.click();
	    
	    //c.click_on_books();
	    c.click_the_book_to_be_purchased();							//adding book to the cart
		c.add_to_cart_button_is_clicked_in_product_page();
		
		dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/cart']")).click();	//click on shopping cart
	}
	
	
	@When("the user clicks checkout and billing address is entered")
	public void the_user_clicks_checkout_and_billing_address_is_entered() 
	{
		dr.findElement(By.xpath("//input[@id='termsofservice']")).click();		//to click checkbox
		dr.findElement(By.xpath("//button[@id='checkout']")).click();	//to click check
		
		/*//Billing address
		WebElement country = dr.findElement(By.xpath("//div[@class='inputs']//select[@id='BillingNewAddress_CountryId']"));
		Select s1 = new Select(country);
		s1.selectByContainsVisibleText("India");
		
		dr.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Moodbidri");
		dr.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("Near Mahaveer Bhavan");
		dr.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("Jain Pete");
		dr.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("574227");
		dr.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("1234567890");
		
		dr.findElement(By.xpath("//div[@id='billing-buttons-container']/input")).click();	//to click continue*/
	}
	
	
	@Then("the user places the order")
	public void the_user_places_the_order() throws InterruptedException 
	{
		
	    /*dr.findElement(By.xpath("//div[@id='shipping-buttons-container']//input")).click();
	    dr.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input")).click();
	    dr.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input")).click();
	    dr.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input")).click();
	    dr.findElement(By.xpath("//div[@id='confirm-order-buttons-container']//input")).click();
	    dr.findElement(By.xpath("//div[@class='buttons']/input")).click();*/
	    
	    dr.findElement(By.xpath("//div[@id=\"billing-buttons-container\"]/input")).click();
	    Thread.sleep(2000);
	    dr.findElement(By.xpath("//div[@id='shipping-buttons-container']/input")).click(); 
	    Thread.sleep(2000);
	    dr.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input")).click();
	    Thread.sleep(2000);
	    dr.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input")).click();
	    Thread.sleep(2000);
	    dr.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input")).click();
	    Thread.sleep(2000);
	    dr.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
	    Thread.sleep(2000);
	    
	    String place_order = dr.findElement(By.xpath("//div[@class='section order-completed']//li[1]")).getText().toLowerCase();
	    dr.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();
	    
	    //click my orders section
	    dr.findElement(By.xpath("//div[@class='header-links']//a[@href='/customer/info']")).click();	//to click account
	    dr.findElement(By.xpath("//div[@class='block block-account-navigation']//a[@href='/customer/orders']")).click(); //to click my orders section
	    

	    //verifying the order id in place order page and in my orders    
	    String myorders = dr.findElement(By.xpath("//div[@class='page account-page order-list-page']//strong")).getText().toLowerCase();
	    Assert.assertEquals(place_order, myorders);
	    System.out.println("The order id verified successfully");    
	}
	
}
