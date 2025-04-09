package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSub {

	@Test
	public void test1() {
		sub_num obj1 = new sub_num();
		System.out.println("in Testsub test1");
		assertEquals(7,obj1.sub(12, 5));
	}
	
	@Test
	public void test2() {
		sub_num obj1 = new sub_num();
		System.out.println("in Testsub test2");
		assertEquals(-8,obj1.sub(-11, -3));
	}
}
