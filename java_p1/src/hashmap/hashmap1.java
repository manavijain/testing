package hashmap;

import java.util.HashMap;

public class hashmap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(1, "Apple");
		map.put(6, "Orange");
		map.put(3, "Banana");
		
		System.out.println(map);
		
		System.out.println(map.get(3));
	}

}
