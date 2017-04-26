package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 27/04/2017.
 *
 * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
 *
 * lastTwo("coding") → "codign"
 * lastTwo("cat") → "cta"
 * lastTwo("ab") → "ba"
 */
public class LastTwoTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", LastTwo.lastTwo(""));
    }

    @Test
    public void whenStringPassedHasLengthLessThan2ThenReturnStringAsIS(){
        assertEquals("a", LastTwo.lastTwo("a"));
    }

    @Test
    public void whenStringPassedInHasLength2ThenReturnStringWithSwappedValues(){
        assertEquals("ba", LastTwo.lastTwo("ab"));
    }

    @Test
    public void whenStringIsPassedInThenReturnStringValueWithLastCharsSwapped(){
        assertEquals("codign", LastTwo.lastTwo("coding"));
    }
}
