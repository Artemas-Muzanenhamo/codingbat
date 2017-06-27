package logic1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/06/2017.
 *
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both.
 * Use the % "mod" operator -- see Introduction to Mod
 *
 * old35(3) → true
 * old35(10) → true
 * old35(15) → false
 */
public class Old35Test {

    @Test
    public void whenTheNumberPassedInIsAMultipleOfOnly3ThenReturnTrue(){
        assertTrue(Old35.old35(3));
    }

    @Test
    public void whenTheNumberPassedInIsAMultipleOfOnly5ThenReturnTrue(){
        assertTrue(Old35.old35(5));
    }

    @Test
    public void whenTheNumberPassedInIsAMutipleFor3And5ThenReturnFalse(){
        assertFalse(Old35.old35(15));
    }

}
