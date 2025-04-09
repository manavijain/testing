package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void testSumWithEqualNums() {
		add_num obj = new add_num();
		int i,j;
		i=j=11;
		System.err.println("in testSumWithEqualNums");
		assertEquals(i+i,obj.sum(i, j));
	}
	
	@Test
	public void testSum() {
		add_num obj = new add_num();
		System.err.println("in testSum");
		assertEquals(4,obj.sum(1, 3));
	}

}
