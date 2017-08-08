package warmup1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

//Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
//
//mixStart("mix snacks") → true
//mixStart("pix snacks") → true
//mixStart("piz snacks") → false


public class Program4Test {

    private Program4 program4;

    @Before
    public void init(){
        program4 = new Program4();
    }
	
	@Test
	public void whenWordLengthIsLessThan2ThenReturnFalse(){
		
		assertFalse(program4.mixStart("a"));
		
	}
	
	@Test
	public void whenWordContainsIXThenReturnTrue(){
		
		assertTrue(program4.mixStart("mix snacks"));

		//lazy
        assertTrue(program4.mixStart("pix snacks"));
		
	}
	
}
