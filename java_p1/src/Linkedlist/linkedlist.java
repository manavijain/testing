package Linkedlist;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> p1 = new LinkedList<>();
		
		p1.add("red");
		p1.add("yellow");
		p1.add("green");
		p1.add("black");
		p1.add("violet");
		System.out.println(p1);
		
		System.out.println("first : "+p1.getFirst());
		System.out.println("last : "+p1.getLast());
		
		p1.removeFirst();
		p1.removeLast();
		System.out.println(p1);
	}

}
