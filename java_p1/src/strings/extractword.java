package strings;

import java.util.*;

public class extractword {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("I work at Mphasis");	
		System.out.println(sb);
		
		List<StringBuilder> mylist = new ArrayList<>();
		StringBuilder temp = new StringBuilder();
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)!=' ')
			{
				temp.append(sb.charAt(i));
			}
			else if(sb.charAt(i)==' ')
			{
				mylist.add(temp);
				temp = new StringBuilder();
			}
		}
		if(!temp.isEmpty())
		{
			mylist.add(temp);
		}
		System.out.println(mylist);		
	}
}
