package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class armedforces {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		ArrayList<String> union=new ArrayList<>();
		union.addAll(Arrays.asList("goa","maharastra","ladakh","delhi","karnataka","lakshadweep","Chandigharh","pondicherry"));
		System.out.println("Enter ur name");
		String name =sc.nextLine();
		System.out.println("Enter ur age");
		int age =sc.nextInt();
		System.out.println("Are u a Indian/ Y?N");
		char country=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter ur state");
		String state=sc.nextLine();
		System.out.println("Are u diableed? Y/N");
		char disable=sc.next().charAt(0);

	
		boolean s1=true;
		if(age<17 || age>36 || country=='n' || disable=='y' ) {
			System.out.println("Not Eligble");
			
		}else {
			for(String s :union) {
				
				if(state==s) {
					s1=false;
					break;					
				}
			}	
			
			if(s1) {
				System.out.println(name+" is eligible");
				
			}else {
				
				System.out.println("Go Home");
			}
				}
		
		
		
		
		
	}
	
	
	
	

}
