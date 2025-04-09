package exceptions;

public class arithmetic {

	public static void main(String[] args) {
		
		int a=10,b=5,c;
		try {
			c=a/(b-5);
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
		
	}

}
