package codingbat;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
//
//in3050(30, 31) → true
//in3050(30, 41) → false
//in3050(40, 50) → true

public class Program8Test {
	
	@Test
	public void whenTwoNumbersAreInRangeOf30To40ThenReturnTrue(){
		assertTrue(Program8.in3050(30, 31));
		assertTrue(Program8.in3050(30, 40));
	}
	
	@Test
	public void whenNumbersAreNotInRangeOf30To40ThenReturnFalse(){
		assertFalse(Program8.in3050(30, 41));
	}
	
	@Test
	public void whenNumbersAreInRangeOf40To50ThenReturnTrue(){
		assertTrue(Program8.in3050(40, 50));
	}
	
	@Test
	public void whenNumbersAreNotInRangeOf40To50ThenReturnFalse(){
		assertFalse(Program8.in3050(46, 30));
	}
}
