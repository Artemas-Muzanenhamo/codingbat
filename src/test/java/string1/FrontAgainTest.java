package string1;

import org.junit.Before;
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
    
    private FrontAgain frontAgain;
    
    @Before
    public void init(){
        frontAgain = new FrontAgain();
    }

    @Test
    public void whenEmptyStringInPassedInThenReturnFalse(){
        assertFalse(frontAgain.frontAgain(""));
    }

    @Test
    public void whenStringPassedInIsLength1ThenReturnStringAsIs(){
        assertFalse(frontAgain.frontAgain("A"));
    }

    @Test
    public void whenStringPassedInContainsEdAtTheFrontAndBackAndIsLength2ThenReturnTrue(){
        assertTrue(frontAgain.frontAgain("ed"));
    }

    @Test
    public void whenStringPassedInContainsEdAtTheFrontAndBackThenReturnTrue(){
        assertTrue(frontAgain.frontAgain("edited"));

        //lazy
        assertTrue(frontAgain.frontAgain("mama"));
        assertTrue(frontAgain.frontAgain("pizza pi"));
    }
}
