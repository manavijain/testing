package pkg1;

public class prgrm5 {

	public static void main(String[] args) {
		
		int num=2537,sum=0,rem,n=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of digits of "+n+" = "+sum);
	}

}
