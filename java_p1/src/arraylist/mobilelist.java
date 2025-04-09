package arraylist;

import java.util.ArrayList;

public class mobilelist{
	
	public static void find_mobile_by_brand(String brand,ArrayList<mobile> mlist) {
		
		System.out.println("Mobiles with brand "+brand+" are : ");
		
		for (mobile m : mlist)
		{
			if(m.brand==brand)
			{
				System.out.println(m.brand+"  "+m.model+" "+m.price+" "+m.ram);
			}
		}
		System.out.println();
	}
	
	public static void display_mobile_details(int price_ll,int price_ul,ArrayList<mobile> mlist)
	{
		
		System.out.println("The mobile phones with price ranging from "+price_ll+" to "+price_ul+" are : ");
		
		for(mobile m: mlist)
		{
			if(m.price >= price_ll && m.price <= price_ul)
			{
	            System.out.println(m.brand + " " + m.model + " " + m.price + " " + m.ram + "GB RAM");
			}
		}
		System.out.println();
	}
	
	public static void display_mobile_details(int ram,ArrayList<mobile> mlist,int price)
	{
		System.out.println("Mobile phones with RAM more than "+ram+" and price less than "+price+" are : ");
		
		for(mobile m : mlist)
		{
			if(m.ram>ram && m.price<price)
			{
				System.out.println(m.brand + " " + m.model + " " + m.price + " " + m.ram + "GB RAM");
			}
		}
	}
}
