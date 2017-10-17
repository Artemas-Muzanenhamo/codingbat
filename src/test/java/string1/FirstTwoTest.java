package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
 * Note that str.length() returns the length of a string.
 *
 * firstTwo("Hello") → "He"
 * firstTwo("abcdefg") → "ab"
 * firstTwo("ab") → "ab"
 */
public class FirstTwoTest {
    
    private FirstTwo firstTwo;
    
    @Before
    public void init(){
        firstTwo = new FirstTwo();
    }

    @Test
    public void whenEmptyStringIsPassedInThenReturnEmptyString(){
        assertEquals("", firstTwo.firstTwo(""));
    }

    @Test
    public void whenStringPassedIsLength1ThenReturnStringAsIs(){
        assertEquals("X", firstTwo.firstTwo("X"));
    }

    @Test
    public void whenStringPassedIsLength2ThenReturnTheTwoChars(){
        assertEquals("ab", firstTwo.firstTwo("ab"));
    }

    @Test
    public void whenStringPassedHasLengthMoreThan3ThenReturnFirst2CharsOfTheString(){
        assertEquals("Ar", firstTwo.firstTwo("Artemas"));
    }
}
