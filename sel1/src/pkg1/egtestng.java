package pkg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class egtestng {
	
  @BeforeMethod
  public void bm() 
  {
	  System.out.println("in BeforeMethod");
  }

  @AfterMethod
  public void am() 
  {
	  System.out.println("in AfterMethod");
  }
  

  @Test
  public void test1() 
  {
	  System.out.println("in test1");
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("in test2");
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("in test3");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("in BeforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("in AfterClass");
  }

}
