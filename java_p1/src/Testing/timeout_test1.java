package Testing;

import org.junit.Test;

public class timeout_test1 {
	
	//Testing Timeout : Test will fail if it takes longer than 1000ms
	@Test(timeout = 2000)
	public void testTimeout()throws InterruptedException 
	{
		Thread.sleep(1500);
	}

}