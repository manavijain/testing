package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class testsumofeven {

	@Test
	public void test() {
		
		int n=94382;
		sumofeven s = new sumofeven();
		int act = s.sumofdigits(n);
		
		assertEquals(act,14);
	}
	
	@Test
	public void test1() {
		
		int n=94382;
		sumofeven s = new sumofeven();
		int act = s.sumofdigits(n);
		
		assertEquals(act,17);
	}
}
