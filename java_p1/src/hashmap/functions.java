package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class functions extends product_main{
	
	public static void display(HashMap<Integer, product> pro)
	{
		System.out.println("Product Inventory:");
		System.out.println();
		System.out.println("ID:  Name:  Price:  Brand:  Quantity");
		System.out.println("--------------------------------------------------");
		
		for (Entry<Integer,product> entry : pro.entrySet()) 
		{
            product product = entry.getValue();            
            System.out.println(product.id + "    " + product.name + "    " + product.price + "    " + product.brand + "    " + product.quantity);
                   
        }
		System.out.println("--------------------------------------------------");
		System.out.println();
	}
	
	public static void purchaseproduct(HashMap<Integer, product> pro, HashMap<Integer, product> purchased)
	{
		Scanner scan= new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the product id you want to purchase : (press 0 to exit)");
			int pro_id=scan.nextInt();
			
			if(pro_id == 0)
			{
				break;
			}
			else
			{
				product p = pro.get(pro_id);		
				System.out.println("Enter the number of units you want to purchase:");
				int units=scan.nextInt();
				
				if(units > p.quantity)
				{
					System.out.println("Product out of stock");
				}
				else
				{
					p.quantity=p.quantity - units;
					purchased.put(pro_id, new product(p.id, p.name, p.price, p.brand, units));
				}
			}
		}
	}
	
	
	public static void showbill(HashMap<Integer, product> purchased) {
	        System.out.println("\nBill:");
	        System.out.println("--------------------------------------------------");
	        System.out.println("ID:  Name:  Price:  Quantity:  Total:");
	        System.out.println("--------------------------------------------------");

	        int grandtotal = 0;
	        for (Entry<Integer, product> entry : purchased.entrySet()) {
	            product p = entry.getValue();
	            int total = p.price * p.quantity;
	            grandtotal = grandtotal+total;

	            System.out.println(p.id + "    " + p.name + "    " + p.price + "    " + p.quantity + "    " + total);
	        }

	        System.out.println("--------------------------------------------------");
	        System.out.println("Total: (before discount) " + grandtotal);
	        System.out.println("--------------------------------------------------");
	        
	        discount(grandtotal);
	    }
	
	public static void discount(int grandtotal)
	{
		double disc=0;
		int discpercentage=0;
		
		if(grandtotal >25000)
		{
			discpercentage=20;
			disc=grandtotal * 0.20;
		}
		else if (grandtotal >=15000 & grandtotal <=25000)
		{
			discpercentage=10;
			disc=grandtotal * 0.10;
		}
		
		System.out.println("Discount Percentage: " + discpercentage + "%");
        System.out.println("Discount Amount: " + disc);
        System.out.println("Grand Total (After Discount): " + (grandtotal - disc));
        System.out.println("--------------------------------------------------");
	}

}
