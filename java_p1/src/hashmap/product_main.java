package hashmap;

import java.util.HashMap;

public class product_main {
	
	static HashMap<Integer,product> pro = new HashMap<>();
	static HashMap<Integer,product> purchased = new HashMap<>();
	
	public static void main(String[] args) {
		
		product p1= new product(101,"Laptop",50000,"Dell", 25);
		product p2= new product(102,"TV",60000,"Samsung", 30);
		product p3= new product(103,"Refrigerator",45000,"Whirlpool", 10);
		product p4= new product(104,"Mobile Phone",20000,"Samsung", 50);
		product p5= new product(105,"Head phone",1500,"Sony",100 );
		product p6= new product(106,"Camera",30000,"Canon",20);
		product p7= new product(107,"Microwave",10000,"Panasonic",40);
		product p8= new product(108,"AC",35000,"Blue Star",20);
		product p9= new product(109,"Smart Watch",8000,"Apple",75);
		product p10= new product(110,"Washing Machine",40000,"LG",15);
		
		pro.put(p1.id,p1);
		pro.put(p2.id,p2);
		pro.put(p3.id,p3);
		pro.put(p4.id,p4);
		pro.put(p5.id,p5);
		pro.put(p6.id,p6);
		pro.put(p7.id,p7);
		pro.put(p8.id,p8);
		pro.put(p9.id,p9);
		pro.put(p10.id,p10);
		
		functions.display(pro);
        functions.purchaseproduct(pro, purchased);
        functions.display(pro);							//updated inventory
        functions.showbill(purchased);

	}

}
