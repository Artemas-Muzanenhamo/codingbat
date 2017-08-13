package warmup1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

//Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
//Note that Math.abs(n) returns the absolute value of a number.
//
//close10(8, 13) → 8
//close10(13, 8) → 8
//close10(13, 7) → 0

public class Program7Test {

    private Program7 program7;

    @Before
    public void init(){
        program7 = new Program7();
    }
	
	@Test
	public void whenNumbersArePassedInThenReturnNumber(){
		assertEquals(0, program7.close10(0, 0));
	}
	
	@Test
	public void whenNumberIsNearestToTenThenReturnTheNumber(){
		assertEquals(8, program7.close10(13, 8));
		assertEquals(8, program7.close10(8, 13));
		assertEquals(13, program7.close10(13, 14));
	}
	
	@Test
	public void whenBothNumbersAreEqualThenReturnZero(){
		assertEquals(0, program7.close10(8, 8));
		assertEquals(0, program7.close10(13, 7));
	}
	
	@Test
	public void whenNegativeNumbersArePassedInThenReturnTheNearestNumber(){
		assertEquals(8, program7.close10(-13, 8));
		assertEquals(8, program7.close10(-13, -8));
	}
	
}
