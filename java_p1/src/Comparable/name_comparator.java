package Comparable;

import java.util.Comparator;
 
public class name_comparator implements Comparator<student>{
	public int compare(student s1,student s2)
	{
		//return s1.sname.compareTo(s2.sname);	//ascending order
		return s2.sname.compareTo(s1.sname);	//descending order
	}
}
