package warmup1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//Return true if the given string contains between 1 and 3 'e' chars.
//
//stringE("Hello") → true
//stringE("Heelle") → true
//stringE("Heelele") → false

public class Program10Test {
	
	@Test
	public void whenEmptyStringIsPassedThenReturnFalse(){
		assertFalse(Program10.stringE(""));
	}
	
	@Test
	public void whenWordContainsOneECharsThenReturnTrue(){
		assertTrue(Program10.stringE("Hello"));
	}
	
	@Test
	public void whenWordContainsThreeECharsThenReturnTrue(){
		assertTrue(Program10.stringE("Heelle"));
	}
	
	@Test
	public void whenWordContainsMoreThanThreeECharsThenReturnFalse(){
		assertFalse(Program10.stringE("Heelele"));
	}

}
