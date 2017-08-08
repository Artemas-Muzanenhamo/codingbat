package warmup1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' 
//and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//startOz("ozymandias") → "oz"
//startOz("bzoo") → "z"
//startOz("oxx") → "o"

public class Program5Test {
    
    private Program5 program5;
    
    @Before
    public void init(){
        program5 = new Program5();
    }
	
	@Test
	public void whenStringLengthIsLessThan2CharsThenReturnStringAsIs(){
		
		assertEquals("o", program5.startOz("on"));
		
	}
	
	@Test
	public void whenFirstCharIsOThenReturnO(){
		
		assertEquals("o", program5.startOz("oxx"));
		
	}
	
	@Test
	public void whenSecondCharIsZthenReturnZ(){
		
		assertEquals("z", program5.startOz("bzoo"));
		
	}
	
	@Test
	public void whenFirstCharIsOAndSecondCharIsZThenReturnOZ(){
		
		assertEquals("oz", program5.startOz("ozymandias"));
		
	}
	
	@Test
	public void whenStringDoesntMatchFirstAndSecondCharThenReturnedEmptyString(){
		assertEquals("", program5.startOz("abc"));
		assertEquals("", program5.startOz("zoo"));
	}
	
	@Test
	public void whenSingleStringOIsPassedThenReturnO(){
		assertEquals("o", program5.startOz("o"));
	}
	
	@Test
	public void whenStringContainsZThenReturnEmptyString(){
		assertEquals("", program5.startOz("z"));
	}
	
	@Test
	public void whenEmptyStringIsPassedThenReturnEmptyString(){
		assertEquals("", program5.startOz(""));
	}
	
	@Test
	public void whenStringContainsZZZZThenReturnZ(){
		assertEquals("z", program5.startOz("zzzz"));
	}

}
