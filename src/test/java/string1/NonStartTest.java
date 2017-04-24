package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
 *
 * nonStart("Hello", "There") → "ellohere"
 * nonStart("java", "code") → "avaode"
 * nonStart("shotl", "java") → "hotlava"
 */
public class NonStartTest {

    @Test
    public void whenStringPassedAreEmptyThenReturnAnEmptyStringValue(){
        assertEquals("", NonStart.nonStart("", ""));
    }

    @Test
    public void whenFirstStringIsPassedAndTheOtherIsEmptyThenReturnPassedValueWithoutTheFirstChar(){
        assertEquals("ello", NonStart.nonStart("Hello", ""));
    }

    @Test
    public void whenSecondStringIsPassedAndTheOtherIsEmptyThenReturnPassedValueWithoutTheFirstChar(){
        assertEquals("orld", NonStart.nonStart("", "World"));
    }

    @Test
    public void whenStringsPassedAreLessThan1InLengthTheReturnStringAsIs(){
        assertEquals("", NonStart.nonStart("A", "B"));
    }

    @Test
    public void whenStringsPassedInAreOfLength2ThenReturnStringWithoutTheirFirstChars(){
        assertEquals("BD", NonStart.nonStart("AB", "CD"));

        //lazy
        assertEquals("ellohere", NonStart.nonStart("Hello", "There"));
    }

}
