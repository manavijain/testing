package Testing;
import java.util.*;

public class armedforce {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<String> unionterritories = new ArrayList<>();
	
	public static void main(String[] args) 
	{
		armedforce af = new armedforce();
		af.addunionterritorries();
		af.application();		
	}
	
	public void addunionterritorries() 
	{
		unionterritories.addAll(Arrays.asList(
			"Dadra and Nagar Haveli and Daman and Diu",
			"Delhi",
			"Jammu and Kashmir",
			"Puducherry",
			"Chandigarh",
			"Andaman and Nicobar Islands",
			"Lakshadweep", 
			"Ladakh"			
		));
		
	}

	public void application()
	{
			System.out.println("Enter the name of the candidate :");
			String name = scan.nextLine();
			System.out.println("Enter the age:");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("Are you specially abled? (y/n)");
			char disability = scan.next().charAt(0);
			scan.nextLine();
			System.out.println("Enter your location : ");
			String location = scan.nextLine();
			if(age>=18 && age<=35)
			{
				
				if(disability=='n')
				{
					if(!unionterritories.contains(location))
					{
						System.out.println(name+ " is eligible");
					}
				}	
			}
			else
			{
				System.out.println(name+ " is not eligible");
			}
			
	}

}










            

