package Linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
		List<String> a11 = new ArrayList<String>();
		ArrayList<String> a12 = new ArrayList<String>();
		
		List<String> vec = new Vector<String>();
		
		vec.add("Java");
		vec.add("Database");
		vec.add("Git");
		
		System.out.println(vec);
		vec.remove("Database");
		System.out.println("After removing : "+vec);

	}

}
