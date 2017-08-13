package warmup1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Program1Test {
	

//We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.
//
//hasTeen(13, 20, 10) → true
//hasTeen(20, 19, 10) → true
//hasTeen(20, 10, 13) → true

    private Program1 program1;

    @Before
    public void init(){
        program1 = new Program1();
    }

	@Test
	public void whenNumberContainTeenThenReturnTrue(){
		
		assertTrue(program1.hasTeen(13, 20, 10));
		assertTrue(program1.hasTeen(20, 19, 10));
		assertTrue(program1.hasTeen(20, 10, 13));
		
	}
	
	@Test
	public void whenNumberDoesNotContainTeenThenReturnFalse(){
		
		assertFalse(program1.hasTeen(9, 9, 9));
		
	}
	
}
