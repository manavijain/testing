package Testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class testavgstudent {
	
	 int ai, ds, ml; 
	 int avg;
	 
	 public testavgstudent(int ai, int ds, int ml, int avg)
	 {
        this.ai = ai;
        this.ds = ds;
        this.ml = ml;
        this.avg = avg;
     }
	 
    // Parameters for the test
    @Parameterized.Parameters
    public static List<Object[]> data()
    {
        System.out.println("in data method");
        Object[][] b = new Object[][] {
            {90, 80, 70, 80},   
            {75, 85, 95, 85},   
            {60, 70, 80, 70},   
            {50, 60, 70, 60},   
            {100, 100, 100, 100} 
        };
        List<Object[]> c = Arrays.asList(b);
		return c;	
    }
    
    average a = new average();
	
	@Test
	public void testavg() 
	{
        System.out.println("AI = " + ai + ", DS = " + ds + ", ML = " + ml + ", average = " + avg);
        assertEquals(avg,a.avg(ai,ds,ml)); 
    }

}
