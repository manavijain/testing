package pkg1;
//program to add digits in odd position
public class prgrm7 {

	public static void main(String[] args) {
		int num=94382,sum=0,rem;
		int pos=5;
		while(num>0)
		{
			rem=num%10;
			if(pos%2!=0)
			{
				sum=sum+rem;
			}
			num=num/10;
			pos--;
		}
		System.out.print("Sum of digits at odd position = "+sum);
	}

}
