package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<student> std_list = new ArrayList<student>();
		std_list.add(new student("Priya",110,26));
		std_list.add(new student("Bob",105,28));
		std_list.add(new student("Rajesh",102,46));
		std_list.add(new student("Suprita",120,36));
		
		for(student s:std_list)
		{
			System.out.println(s.id+" "+s.sname+" "+s.age);
		}
		System.out.println("\n \n");
		
		Collections.sort(std_list,new name_comparator());
		for(student s:std_list)
		{
			System.out.println(s.id+" "+s.sname+" "+s.age);
		}
		System.out.println("\n \n");
		
		//Collections.sort(std_list, new RollNoComparator());
	}

}
