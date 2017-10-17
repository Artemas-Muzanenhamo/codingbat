package string1;

import org.junit.Before;
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
    
    private MinCat minCat;
    
    @Before
    public void init(){
        minCat = new MinCat();
    }

    @Test
    public void whenEmptyStringsIsPassedThenReturnEmptyValue(){
        assertEquals("", minCat.minCat("", ""));
    }

    @Test
    public void whenOnlyTheRightStringIsPassedThenReturnEmptyString(){
        assertEquals("", minCat.minCat("", "Hello"));
    }

    @Test
    public void whenOnlyTheLeftStringIsPassedThenReturnEmptyString(){
        assertEquals("", minCat.minCat("Hello", ""));
    }

    @Test
    public void whenBothStringsPassedAreEqualToEachOtherThenReturnAConcatenatedString(){
        assertEquals("HelloArtie", minCat.minCat("Hello", "Artie"));
    }

    @Test
    public void whenLeftStringPassedIsBiggerInLenthThenOmitCharsFromTheLeftString(){
        assertEquals("ellojava", minCat.minCat("Hello", "java"));

        //lazy
        assertEquals("loHi", minCat.minCat("Hello", "Hi"));
    }

    @Test
    public void whenRightStringPassedIsBiggerInLenthThenOmitCharsFromTheRightString(){
        assertEquals("javaello", minCat.minCat("java", "Hello"));

        //lazy
        assertEquals("Artemasnenhamo", minCat.minCat("Artemas", "Muzanenhamo"));
    }


}
