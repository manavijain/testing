package Adv_Features;

import org.openqa.selenium.Cookie;

import Utilities.common_methods;

public class CookiesMgmt extends common_methods
{
	public static void addCookie(String cname, String cvalue)
	{
		Cookie c = new Cookie(cname,cvalue);
		dr.manage().addCookie(c);
	}
	
	public static void display_cookie()
	{
		for(Cookie c : dr.manage().getCookies())
		{
			System.out.println("name : "+ c.getName() + "value : "+ c.getValue());
		}
	}
	
	public static void delete_cookie(String cname)
	{
		dr.manage().deleteCookieNamed(cname);
	}
	
	public static void main(String[] args)
	{
		launch_chrome("https://www.flipkart.com/");
		addCookie("UserSession","123456");
		addCookie("Place","Bangalore");
		
		display_cookie();
		
		delete_cookie("Place");
		
		if(dr.manage().getCookieNamed("Place") == null)
			System.out.println("TestCookie successfully deleted.");
		else
			System.out.println("Not deleted");
	}
}
