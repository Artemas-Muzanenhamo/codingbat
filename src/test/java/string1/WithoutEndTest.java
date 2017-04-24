package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
 *
 * withoutEnd("Hello") → "ell"
 * withoutEnd("java") → "av"
 * withoutEnd("coding") → "odin"
 */
public class WithoutEndTest {

    @Test
    public void whenEmptyStringIsPassedInThenReturnEmptyStringValue(){
        assertEquals("", WithoutEnd.withoutEnd(""));
    }

    @Test
    public void whenStringLengthIsLessThan2ThenReturnStringAsIs(){
        assertEquals("A", WithoutEnd.withoutEnd("A"));
    }

    @Test
    public void whenStringOfLength2IsPassedThenReturnEmptyString(){
        assertEquals("", WithoutEnd.withoutEnd("AB"));
    }

    @Test
    public void whenStringIsPassedAndLengthIsGreaterThan2ThenReturnStringWithoutFirstAndLastIndex(){
        assertEquals("av", WithoutEnd.withoutEnd("java"));
    }

}
