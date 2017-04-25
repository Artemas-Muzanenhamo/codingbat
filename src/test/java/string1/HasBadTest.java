package string1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 25/04/2017.
 *
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
 * The string may be any length, including 0. Note: use .equals() to compare 2 strings.
 *
 * hasBad("badxx") → true
 * hasBad("xbadxx") → true
 * hasBad("xxbadxx") → false
 *
 */
public class HasBadTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertFalse(HasBad.hasBad(""));
    }

    @Test
    public void whenStringHasLengthOf2ThenReturnStringValueAsIs(){
        assertFalse(HasBad.hasBad("Hi"));
    }

    @Test
    public void whenStringPassedInContainsBADOnTheFirstIndexThenReturnTrue(){
        assertTrue(HasBad.hasBad("badxx"));
    }

    @Test
    public void whenStringPassedInContainsBADOnTheSecondIndexThenReturnTrue(){
        assertTrue(HasBad.hasBad("xbadxx"));
    }

    @Test
    public void whenStringPassedInContainsBADFromIndex3ThenReturnFalse(){
        assertFalse(HasBad.hasBad("xxbadxx"));
    }

}
