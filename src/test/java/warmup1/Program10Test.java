package warmup1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

//Return true if the given string contains between 1 and 3 'e' chars.
//
//stringE("Hello") → true
//stringE("Heelle") → true
//stringE("Heelele") → false

public class Program10Test {

    private Program10 program10;

    @Before
    public void init(){
        program10 = new Program10();
    }
	
	@Test
	public void whenEmptyStringIsPassedThenReturnFalse(){
		assertFalse(program10.stringE(""));
	}
	
	@Test
	public void whenWordContainsOneECharsThenReturnTrue(){
		assertTrue(program10.stringE("Hello"));
	}
	
	@Test
	public void whenWordContainsThreeECharsThenReturnTrue(){
		assertTrue(program10.stringE("Heelle"));
	}
	
	@Test
	public void whenWordContainsMoreThanThreeECharsThenReturnFalse(){
		assertFalse(program10.stringE("Heelele"));
	}

}
