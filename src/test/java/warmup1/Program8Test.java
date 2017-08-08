package warmup1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

//Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
//
//in3050(30, 31) → true
//in3050(30, 41) → false
//in3050(40, 50) → true

public class Program8Test {
    
    private Program8 program8;
    
    @Before
    public void init(){
        program8 = new Program8();
    }
	
	@Test
	public void whenTwoNumbersAreInRangeOf30To40ThenReturnTrue(){
		assertTrue(program8.in3050(30, 31));
		assertTrue(program8.in3050(30, 40));
	}
	
	@Test
	public void whenNumbersAreNotInRangeOf30To40ThenReturnFalse(){
		assertFalse(program8.in3050(30, 41));
	}
	
	@Test
	public void whenNumbersAreInRangeOf40To50ThenReturnTrue(){
		assertTrue(program8.in3050(40, 50));
	}
	
	@Test
	public void whenNumbersAreNotInRangeOf40To50ThenReturnFalse(){
		assertFalse(program8.in3050(46, 30));
	}
}
