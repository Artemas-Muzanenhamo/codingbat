package codingbat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
//
//max1020(11, 19) → 19
//max1020(19, 11) → 19
//max1020(11, 9) → 11

public class Program9Test {
	
	@Test
	public void whenNumbersAreInRangeOf10To20ThenReturnTheBiggerNumber(){
		assertEquals(19, Program9.max1020(11, 19));
	}
	
	@Test
	public void whenOneNumberIsInRangeOf10To20ThenReturnTheNumberInRange(){
		assertEquals(11, Program9.max1020(11, 9));
		assertEquals(11, Program9.max1020(9, 11));
	}
	
	@Test
	public void whenBothNumbersAreNotInRangeOf10To20ThenReturnZero(){
		assertEquals(0, Program9.max1020(4, 50));
	}
	
	@Test
	public void whenNegativeNumbersAreUsedThenConvertToPositiveValuesAndReturnBiggestNumberInRange(){
		assertEquals(12, Program9.max1020(-12, 10));
		assertEquals(12, Program9.max1020(-12, 1));
		assertEquals(13, Program9.max1020(-5, 13));
		assertEquals(0, Program9.max1020(-5, -8));
	}

}
