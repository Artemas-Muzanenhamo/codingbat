package warmup1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
//
//max1020(11, 19) → 19
//max1020(19, 11) → 19
//max1020(11, 9) → 11

public class Program9Test {
    
    private Program9 program9;
    
    @Before
    public void init(){
        program9 = new Program9();
    }
	
	@Test
	public void whenNumbersAreInRangeOf10To20ThenReturnTheBiggerNumber(){
		assertEquals(19, program9.max1020(11, 19));
	}
	
	@Test
	public void whenOneNumberIsInRangeOf10To20ThenReturnTheNumberInRange(){
		assertEquals(11, program9.max1020(11, 9));
		assertEquals(11, program9.max1020(9, 11));
	}
	
	@Test
	public void whenBothNumbersAreNotInRangeOf10To20ThenReturnZero(){
		assertEquals(0, program9.max1020(4, 50));
	}
	
	@Test
	public void whenNegativeNumbersAreUsedThenConvertToPositiveValuesAndReturnBiggestNumberInRange(){
		assertEquals(12, program9.max1020(-12, 10));
		assertEquals(12, program9.max1020(-12, 1));
		assertEquals(13, program9.max1020(-5, 13));
		assertEquals(0, program9.max1020(-5, -8));
	}

}
