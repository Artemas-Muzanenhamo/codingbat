package codingbat;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Program1Test {
	

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
//
//hasTeen(13, 20, 10) → true
//hasTeen(20, 19, 10) → true
//hasTeen(20, 10, 13) → true

	@Test
	public void whenNumberContainTeenThenReturnTrue(){
		
		assertTrue(Program1.hasTeen(13, 20, 10));
		assertTrue(Program1.hasTeen(20, 19, 10));
		assertTrue(Program1.hasTeen(20, 10, 13));
		
	}
	
	@Test
	public void whenNumberDoesNotContainTeenThenReturnFalse(){
		
		assertFalse(Program1.hasTeen(9, 9, 9));
		
	}
	
}
