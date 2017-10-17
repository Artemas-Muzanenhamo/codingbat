package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 04/05/2017.
 *
 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 * The string may be any length. If there are fewer than 2 chars, use whatever is there.
 *
 * extraFront("Hello") → "HeHeHe"
 * extraFront("ab") → "ababab"
 * extraFront("H") → "HHH"
 */
public class ExtraFrontTest {

    private ExtraFront extraFront;

    @Before
    public void init(){
        extraFront = new ExtraFront();
    }

    @Test
    public void whenAnEmptyStringIsPassedThenReturnAnEmptyValue(){
        assertEquals("", extraFront.extraFront(""));
    }

    @Test
    public void whenStringPassedInIsLength1ThenReturn3CopiesOfTheString(){
        assertEquals("AAA", extraFront.extraFront("A"));
    }

    @Test
    public void whenStringPassedInHasLengthGreaterThan1ThenReturn3CopiesOfTheFirst2Chars(){
        assertEquals("ababab", extraFront.extraFront("abel"));
    }

}
