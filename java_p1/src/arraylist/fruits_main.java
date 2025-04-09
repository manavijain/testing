package arraylist;

import java.util.ArrayList;

public class fruits_main {
	
	public static void main(String[] args)
	{
		ArrayList<fruits> flist = new ArrayList<fruits>();
		
		fruits f1 = new fruits("Apple","Red");
		fruits f2 = new fruits("Grapes","Green");
		fruits f4 = new fruits("Mango","Yellow");
		
		//flist.add(null);
		flist.add(f1);
		flist.add(f2);
		flist.add(f4);
		
		fruits f3 = flist.get(0);
		//s3.display();
		
		for(fruits f5 : flist)
		{
			if(f5.colour == "Red")
				System.out.println("The fruit with red colour is "+f5.name);
		}
	}
}
