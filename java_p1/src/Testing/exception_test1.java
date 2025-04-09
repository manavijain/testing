package Testing;

import org.junit.Test;

public class exception_test1 {
	
	//Testing Exception : Expecting an ArithmeticException for division by zero
	@Test (expected = ArithmeticException.class)
	public void testDivisionByZero() 
	{
		int a = 1/0;
	}

	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void arrayoutofbound() 
	{
		int [] arr = new int[4];
		arr[5]=10;
	}
}

