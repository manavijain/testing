package exceptions;

public class indexoutofbound {

	public static void main(String[] args) {
		
		try
		{
			int a[]=new int[3];
			for(int i=0;i<6;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catching");
		}
		finally
		{
			System.out.println("finally");
		}
	}

}
