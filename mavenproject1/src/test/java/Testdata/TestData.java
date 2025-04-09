package Testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Pages.login_page;
import POM_Pages.products_page;
import Utilities.common_methods;

public class TestData extends common_methods
{
	
    Object[][] testdata = new Object[2][2]; 
    int r, c; 
    
    login_page lp;
	products_page pp;
	
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  launch_chrome("https://www.saucedemo.com");
		lp = new login_page(dr);
		pp = new products_page(dr);
  }
 

  @AfterMethod
  public void afterMethod()
  {
	  dr.close();
  }

    @BeforeClass
    public void FromExcel() throws IOException 
    {
        for (r = 1; r <= 2; r++) 
        {
            for (c = 0; c <= 1; c++) 
            { 
                testdata[r - 1][c] = readexcel(r, c); 
            }
        }
    }

    public String readexcel(int r2, int c2) throws IOException 
    {
        String filename = "Login Test Data.xlsx";
        String sheetname = "Sheet1";

        FileInputStream fis = new FileInputStream(filename); 
        XSSFWorkbook wb = new XSSFWorkbook(fis); 
        XSSFSheet sh = wb.getSheet(sheetname); 

        String cellData = sh.getRow(r2).getCell(c2).toString(); 
        wb.close(); 
        fis.close(); 
        return cellData; 
    }

    @DataProvider(name = "logindata")
    public Object[][] getdata() 
    {
        return testdata;
    }

    
    @Test(dataProvider = "logindata")
    public void test1(String uid, String pwd)
    {
  	  lp.enter_uname(uid);
  	  lp.enter_pwd(pwd);
  	  lp.click_login();
  	  String atitle = pp.get_title();
  	  Assert.assertEquals("Products", atitle);
    }
    
    @Test
    public void test2(String uid, String pwd)
    {
  	  lp.enter_uname(uid);
  	  lp.enter_pwd(pwd);
  	  lp.click_login();
  	  String atitle = pp.get_title();
  	  Assert.assertEquals("Products1", atitle);
    }

}
