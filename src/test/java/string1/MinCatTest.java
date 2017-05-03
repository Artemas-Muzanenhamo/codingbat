package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 03/05/2017.
 *
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
 * So "Hello" and "Hi" yield "loHi". The strings may be any length.
 *
 * minCat("Hello", "Hi") → "loHi"
 * minCat("Hello", "java") → "ellojava"
 * minCat("java", "Hello") → "javaello"
 */
public class MinCatTest {

    @Test
    public void whenEmptyStringsIsPassedThenReturnEmptyValue(){
        assertEquals("", MinCat.minCat("", ""));
    }

    @Test
    public void whenOnlyTheRightStringIsPassedThenReturnEmptyString(){
        assertEquals("", MinCat.minCat("", "Hello"));
    }

    @Test
    public void whenOnlyTheLeftStringIsPassedThenReturnEmptyString(){
        assertEquals("", MinCat.minCat("Hello", ""));
    }

    @Test
    public void whenBothStringsPassedAreEqualToEachOtherThenReturnAConcatenatedString(){
        assertEquals("HelloArtie", MinCat.minCat("Hello", "Artie"));
    }

    @Test
    public void whenLeftStringPassedIsBiggerInLenthThenOmitCharsFromTheLeftString(){
        assertEquals("ellojava", MinCat.minCat("Hello", "java"));

        //lazy
        assertEquals("loHi", MinCat.minCat("Hello", "Hi"));
    }

    @Test
    public void whenRightStringPassedIsBiggerInLenthThenOmitCharsFromTheRightString(){
        assertEquals("javaello", MinCat.minCat("java", "Hello"));

        //lazy
        assertEquals("Artemasnenhamo", MinCat.minCat("Artemas", "Muzanenhamo"));
    }


}
