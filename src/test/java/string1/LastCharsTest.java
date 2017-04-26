package string1;

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

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("@@", LastChars.lastChars("", ""));
    }

    @Test
    public void whenLeftParameterIsEmptyThenReturnTheRightString(){
        assertEquals("@a", LastChars.lastChars("", "java"));
    }

    @Test
    public void whenRightParameterIsEmptyThenReturnTheLeftString(){
        assertEquals("j@", LastChars.lastChars("java", ""));
    }

    @Test
    public void whenStringsArePassedInThenReturnFirstCharAndLastCharAsStringValue(){
        assertEquals("ya", LastChars.lastChars("yo", "java"));
    }
}
