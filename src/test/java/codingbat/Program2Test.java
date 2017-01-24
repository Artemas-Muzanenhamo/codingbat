package codingbat;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Program2Test {
	

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.
//
//loneTeen(13, 99) → true
//loneTeen(21, 19) → true
//loneTeen(13, 13) → false

	
	@Test
	public void whenOneNumberHasTeenThenReturnTrue(){
		
		assertTrue(Program2.loneTeen(13, 99));
		assertTrue(Program2.loneTeen(21, 19));
		
	}
	
	@Test
	public void whenTwoNumbersHasTeenThenReturnFalse(){
		assertFalse(Program2.loneTeen(13, 13));
	}
	
	@Test
	public void whenTwoNumbersDoNotHaveTeenThenReturnFalse(){
		assertFalse(Program2.loneTeen(99, 99));
	}
	
}
