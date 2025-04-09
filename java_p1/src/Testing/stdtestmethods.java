package Testing;

import static org.junit.Assert.*;
import org.junit.*;

public class stdtestmethods {

    int ai, ds, ml; 
    int avg;
    int[][] testdata; 
    average a = new average(); 

    @Before
    public void setup() {
        testdata = new int[][] { 
            {90, 80, 70, 80},   
            {75, 85, 95, 85},   
            {60, 70, 80, 70}   
        };
    }

    @Test
    public void test1() {
        ai = testdata[0][0];
        ds = testdata[0][1];
        ml = testdata[0][2];
        avg = testdata[0][3];
        assertEquals(avg, a.avg(ai, ds, ml));
    }

    @Test
    public void test2() {
        ai = testdata[1][0];
        ds = testdata[1][1];
        ml = testdata[1][2];
        avg = testdata[1][3];
        assertEquals(avg, a.avg(ai, ds, ml));
    }

    @Test
    public void test3() {
        ai = testdata[2][0];
        ds = testdata[2][1];
        ml = testdata[2][2];
        avg = testdata[2][3];
        assertEquals(avg, a.avg(ai, ds, ml)); 
    }
}
