package Comparable;

import java.util.Comparator;
import Comparable.student;

public class RollNoComparator implements Comparator<student>{
	
	public int compare(student s1,student s2)
	{
		//return s2.id - s1.id; 	//descending order
		return s1.id - s2.id; 	//ascending order
	}
}
