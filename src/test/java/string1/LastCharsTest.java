package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 25/04/2017.
 *
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
 * If either string is length 0, use '@' for its missing char.
 *
 * lastChars("last", "chars") → "ls"
 * lastChars("yo", "java") → "ya"
 * lastChars("hi", "") → "h@"
 */
public class LastCharsTest {
    
    private LastChars lastChars;
    
    @Before
    public void init(){
        lastChars = new LastChars();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("@@", lastChars.lastChars("", ""));
    }

    @Test
    public void whenLeftParameterIsEmptyThenReturnTheRightString(){
        assertEquals("@a", lastChars.lastChars("", "java"));
    }

    @Test
    public void whenRightParameterIsEmptyThenReturnTheLeftString(){
        assertEquals("j@", lastChars.lastChars("java", ""));
    }

    @Test
    public void whenStringsArePassedInThenReturnFirstCharAndLastCharAsStringValue(){
        assertEquals("ya", lastChars.lastChars("yo", "java"));
    }
}
