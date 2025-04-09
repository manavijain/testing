package Testing;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class testflipkart {
	
	@Test
	public void testPurchaseProduct() {
		
		HashMap<Integer,product> pro = new HashMap<>();
	
		product p1= new product(101,"Laptop",50000,"Dell",25);
	    product p2 = new product(102,"TV",60000,"Samsung",30);
	    product p3 = new product(103,"Refrigerator",45000,"Whirlpool",10);
	    
		pro.put(p1.id, p1);
		pro.put(p2.id, p2);
		pro.put(p3.id, p3);
		
		flipkart_fn f = new flipkart_fn();
		//HashMap<Integer,product> act = f.purchaseproduct();
		assertTrue(pro.equals(f.purchaseproduct()));
	}  
}
