package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 * Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
 *
 * withouEnd2("Hello") → "ell"
 * withouEnd2("abc") → "b"
 * withouEnd2("ab") → ""
 */
public class WithoutEnd2Test {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", WithoutEnd2.withoutEnd2(""));
    }

    @Test
    public void whenStringIsLength1thenReturnEmptyValue(){
        assertEquals("", WithoutEnd2.withoutEnd2("A"));
    }

    @Test
    public void whenStringPassedInHasLength2ThenReturnEmptyValue(){
        assertEquals("", WithoutEnd2.withoutEnd2("ab"));
    }

    @Test
    public void whenStringPassedInHasLengthBiggerThan2ThenReturnStringWithNotFirstAndLastChar(){
        assertEquals("ell", WithoutEnd2.withoutEnd2("Hello"));

        //lazy
        assertEquals("b", WithoutEnd2.withoutEnd2("abc"));
    }
}
