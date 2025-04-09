package stepdef_context;

import Utilities.common_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ScenarioContext;
import utilities.TestContext;

public class LoginSteps extends common_methods
{
	TestContext toContext;
	
	@Given("The login page is displayed")
	public void the_login_page_is_displayed() 
	{
		launch_chrome("https://www.saucedemo.com/");
	    System.out.println("The login page is displayed");
	    toContext = new TestContext();
	}
	
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String uid, String pwd) 
	{
	    System.out.println("User enters valid username and password");
	    toContext.set(ScenarioContext.USERNAME.toString(), uid);
	    //toContext.set("name", uid);
	    
	    toContext.set(ScenarioContext.SESSION_TOKEN.toString(), "asd7898");
	    //toContext.set("Session_token", asd789);
	}
	
	
	@Then("User session should be available")
	public void user_session_should_be_available() 
	{
	    String storeuid = (String) toContext.get(ScenarioContext.USERNAME.toString());
	    String sessionToken = (String) toContext.get(ScenarioContext.SESSION_TOKEN.toString());
	    
	    System.out.println("storeuid : "+ storeuid + "\n sessionToken : "+ sessionToken);
	}
}
