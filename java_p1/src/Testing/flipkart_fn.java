package Testing;

import java.util.HashMap;
import java.util.Scanner;

public class flipkart_fn {

    public static HashMap<Integer, product> purchaseproduct() {
        
        HashMap<Integer, product> purchased = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the product id you want to purchase : (press 0 to exit)");
            int pro_id = scan.nextInt();

            if (pro_id == 0)
            {
                break;
            } 
            else
            {
                System.out.println("Enter the product name:");
                String name = scan.next();
                System.out.println("Enter the product price:");
                int price = scan.nextInt();
                System.out.println("Enter the product brand:");
                String brand = scan.next();
                System.out.println("Enter the quantity available:");
                int quantity = scan.nextInt();

                purchased.put(pro_id, new product(pro_id, name, price, brand, quantity));
                System.out.println("Product added successfully!");
            }
        }
        return purchased; 
    }
}