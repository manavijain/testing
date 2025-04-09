package Testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class param_example5 {
	
	private int num1,num2,expected_op;
	
	//Constructor that takes parameters for each test instance
	public param_example5(int num1,int num2,int expected_op)
	{
		this.num1=num1;
		this.num2=num2;
		this.expected_op=expected_op;
		System.out.println("in constructor");
	}
	
	//Parameters for the test
	@Parameterized.Parameters
	public static List<Object[]> data()
	{
		System.out.println("in data method");
		Object b[][] = new Object[][]
		{
			{1,2,3},
			{4,5,9},
			{5,6,11},
			{-9,-2,-11}
		};
		List<Object[]> c = Arrays.asList(b);
		return c;		
	}
	
	//method under test
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("in sum");
		return c;
	}
	@Test
	public void test() 
	{
		System.out.println("num1: "+num1+" num2: "+num2+" expected_op: "+expected_op);
		assertEquals(expected_op,sum(num1,num2));
	}

}
