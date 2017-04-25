package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 25/04/2017.
 *
 * Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars.
 * The string length will be at least 2.
 *
 * twoChar("java", 0) → "ja"
 * twoChar("java", 2) → "va"
 * twoChar("java", 3) → "ja"
 */
public class TwoCharTest {

    @Test
    public void whenAnEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", TwoChar.twoChar("", 0));
    }

    @Test
    public void whenStringPassedInHasLength1ThenReturnEmptyString(){
        assertEquals("", TwoChar.twoChar("A", 2));
    }

    @Test
    public void whenStringPassedInHasLength2AndIndexIs0ThenReturnStringAsIs(){
        assertEquals("ja", TwoChar.twoChar("java", 0));
    }

    @Test
    public void whenStringJavaIsPassedAndHasLength4AndIndex2ThenReturnVA(){
        assertEquals("va", TwoChar.twoChar("java", 2));

        //lazy
        assertEquals("rt", TwoChar.twoChar("Art", 1));
        assertEquals("ab", TwoChar.twoChar("ab", 3));
    }

    @Test
    public void whenStringJavaIsPassedAndHasLength4AndIndex3TheReturnTheFirstTwoChars(){
        assertEquals("ja", TwoChar.twoChar("java", 3));
    }

}
