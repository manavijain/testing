package KB_Mouse_Movements;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class asserttrue 
{
	WebDriver dr = new ChromeDriver();
	
  @Test
  public void test() 
  {
	  String title = dr.getTitle();
	  Assert.assertTrue(title.contains("Checkbox"));
  }
  
  
  @BeforeClass
  public void beforeClass() 
  {
	  
	  dr.get("https://jqueryui.com/checkboxradio/");
	  dr.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() 
  {
	 dr.quit(); 
  }

}
