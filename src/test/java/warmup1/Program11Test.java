package warmup1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
//So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//
//everyNth("Miracle", 2) → "Mrce"
//everyNth("abcdefg", 2) → "aceg"
//everyNth("abcdefg", 3) → "adg"

public class Program11Test {
	
	@Test
	public void whenStringPassedIsEmptyThenReturnEmptyString(){
		assertEquals("", Program11.everyNth("", 5));
	}
	
	@Test
	public void whenNumberIsLessThanOneThenReturnString(){
		assertEquals("hello", Program11.everyNth("hello", 0));
	}
	
	@Test
	public void whenNumberIsGreaterThanStringLengthThenReturnStringAsIs(){
		assertEquals("h", Program11.everyNth("hello", 6));
	}
	
	@Test
	public void whenNthCharOfStringIsPassedThenReturnNewString(){
		assertEquals("Mrce", Program11.everyNth("Miracle", 2));
		assertEquals("aceg", Program11.everyNth("abcdefg", 2));
		assertEquals("adg", Program11.everyNth("abcdefg", 3));
	}
	
}
