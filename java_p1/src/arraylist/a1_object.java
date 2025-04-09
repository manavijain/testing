package arraylist;

import java.util.ArrayList;

public class a1_object {
	
	public static void main(String[] args)
	{
		ArrayList<student> slist = new ArrayList<student>();
		
		student s1 = new student("Satish",101);
		student s2 = new student("Priya",102);
		student s4 = new student("Bindiya",104);
		//slist.add(null);
		slist.add(s1);
		slist.add(s2);
		slist.add(s4);
		
		student s3 = slist.get(0);
		//s3.display();
		
		for(student s5 : slist)
		{
			if(s5.id == 101)
				System.out.println("Student's name is "+ s5.name);
		}
	}
}
