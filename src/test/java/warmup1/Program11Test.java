package warmup1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
//So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
//
//everyNth("Miracle", 2) → "Mrce"
//everyNth("abcdefg", 2) → "aceg"
//everyNth("abcdefg", 3) → "adg"

public class Program11Test {

    private Program11 program11;

    @Before
    public void init(){
        program11 = new Program11();
    }
	
	@Test
	public void whenStringPassedIsEmptyThenReturnEmptyString(){
		assertEquals("", program11.everyNth("", 5));
	}
	
	@Test
	public void whenNumberIsLessThanOneThenReturnString(){
		assertEquals("hello", program11.everyNth("hello", 0));
	}
	
	@Test
	public void whenNumberIsGreaterThanStringLengthThenReturnStringAsIs(){
		assertEquals("h", program11.everyNth("hello", 6));
	}
	
	@Test
	public void whenNthCharOfStringIsPassedThenReturnNewString(){
		assertEquals("Mrce", program11.everyNth("Miracle", 2));
		assertEquals("aceg", program11.everyNth("abcdefg", 2));
		assertEquals("adg", program11.everyNth("abcdefg", 3));
	}
	
}
