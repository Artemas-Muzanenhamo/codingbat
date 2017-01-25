package codingbat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' 
//and include the second only if it is 'z', so "ozymandias" yields "oz".
//
//startOz("ozymandias") → "oz"
//startOz("bzoo") → "z"
//startOz("oxx") → "o"

public class Program5Test {
	
	@Test
	public void whenStringLengthIsLessThan2CharsThenReturnStringAsIs(){
		
		assertEquals("o", Program5.startOz("on"));
		
	}
	
	@Test
	public void whenFirstCharIsOThenReturnO(){
		
		assertEquals("o", Program5.startOz("oxx"));
		
	}
	
	@Test
	public void whenSecondCharIsZthenReturnZ(){
		
		assertEquals("z", Program5.startOz("bzoo"));
		
	}
	
	@Test
	public void whenFirstCharIsOAndSecondCharIsZThenReturnOZ(){
		
		assertEquals("oz", Program5.startOz("ozymandias"));
		
	}
	
	@Test
	public void whenStringDoesntMatchFirstAndSecondCharThenReturnedEmptyString(){
		assertEquals("", Program5.startOz("abc"));
		assertEquals("", Program5.startOz("zoo"));
	}
	
	@Test
	public void whenSingleStringOIsPassedThenReturnO(){
		assertEquals("o", Program5.startOz("o"));
	}
	
	@Test
	public void whenStringContainsZThenReturnEmptyString(){
		assertEquals("", Program5.startOz("z"));
	}
	
	@Test
	public void whenEmptyStringIsPassedThenReturnEmptyString(){
		assertEquals("", Program5.startOz(""));
	}
	
	@Test
	public void whenStringContainsZZZZThenReturnZ(){
		assertEquals("z", Program5.startOz("zzzz"));
	}

}
