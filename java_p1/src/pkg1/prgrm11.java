package pkg1;

public class prgrm11 {
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int multiply(int m,int n)
	{
		return m*n;
	}
	
	public static void main(String[] args)
	{
		int x,y;
		x=add(13,20);
		System.out.println("Sum: "+x);
		y=multiply(12,13);
		System.out.println("Product: "+y);
	}
}
