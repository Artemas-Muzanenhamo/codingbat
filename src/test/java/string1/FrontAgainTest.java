package string1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 02/05/2017.
 *
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
 *
 * frontAgain("edited") → true
 * frontAgain("edit") → false
 * frontAgain("ed") → true
 */
public class FrontAgainTest {

    @Test
    public void whenEmptyStringInPassedInThenReturnFalse(){
        assertFalse(FrontAgain.frontAgain(""));
    }

    @Test
    public void whenStringPassedInIsLength1ThenReturnStringAsIs(){
        assertFalse(FrontAgain.frontAgain("A"));
    }

    @Test
    public void whenStringPassedInContainsEdAtTheFrontAndBackAndIsLength2ThenReturnTrue(){
        assertTrue(FrontAgain.frontAgain("ed"));
    }

    @Test
    public void whenStringPassedInContainsEdAtTheFrontAndBackThenReturnTrue(){
        assertTrue(FrontAgain.frontAgain("edited"));

        //lazy
        assertTrue(FrontAgain.frontAgain("mama"));
        assertTrue(FrontAgain.frontAgain("pizza pi"));
    }
}
