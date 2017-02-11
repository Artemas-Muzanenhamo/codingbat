package warmup1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//mixStart("mix snacks") → true
//mixStart("pix snacks") → true
//mixStart("piz snacks") → false


public class Program4Test {
	
	@Test
	public void whenWordLengthIsLessThan2ThenReturnFalse(){
		
		assertFalse(Program4.mixStart("a"));
		
	}
	
	@Test
	public void whenWordContainsIXThenReturnTrue(){
		
		assertTrue(Program4.mixStart("mix snacks"));
		
	}
	
}
