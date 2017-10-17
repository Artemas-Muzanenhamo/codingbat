package string1;

import org.junit.Before;
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
    
    private NonStart nonStart;
    
    @Before
    public void init(){
        nonStart = new NonStart();
    }

    @Test
    public void whenStringPassedAreEmptyThenReturnAnEmptyStringValue(){
        assertEquals("", nonStart.nonStart("", ""));
    }

    @Test
    public void whenFirstStringIsPassedAndTheOtherIsEmptyThenReturnPassedValueWithoutTheFirstChar(){
        assertEquals("ello", nonStart.nonStart("Hello", ""));
    }

    @Test
    public void whenSecondStringIsPassedAndTheOtherIsEmptyThenReturnPassedValueWithoutTheFirstChar(){
        assertEquals("orld", nonStart.nonStart("", "World"));
    }

    @Test
    public void whenStringsPassedAreLessThan1InLengthTheReturnStringAsIs(){
        assertEquals("", nonStart.nonStart("A", "B"));
    }

    @Test
    public void whenStringsPassedInAreOfLength2ThenReturnStringWithoutTheirFirstChars(){
        assertEquals("BD", nonStart.nonStart("AB", "CD"));

        //lazy
        assertEquals("ellohere", nonStart.nonStart("Hello", "There"));
    }

}
