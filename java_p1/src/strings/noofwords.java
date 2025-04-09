package strings;

import java.util.Scanner;

public class noofwords {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String s=scan.nextLine();
		
		StringBuilder sb = new StringBuilder(s);
		
		int count=1;
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i) == ' ')
			{
				count++;
			}
		}
		System.out.println("No of words in given sentence is "+count);

	}

}
