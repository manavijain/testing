package Testing;

public class sumofeven {

	public int sumofdigits(int num)
	{
		int sum=0,rem,n=num;
		while(num>0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			num=num/10;
		}
		return sum;	
	}
}
