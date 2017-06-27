package logic1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/06/2017.
 *
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 *
 * So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod
 *
 * less20(18) → true
 * less20(19) → true
 * less20(20) → false
 */
public class Less20Test {

    @Test
    public void whenNumberPassedInIs2LessThanTheMultipleOf20ThenReturnTrue(){
        assertTrue(Less20.less20(18));
    }

    @Test
    public void whenNumberPassedInIs1LessThanMultipleOf20ThenReturnTrue(){
        assertTrue(Less20.less20(19));
    }

    @Test
    public void whenNumberPassedInIsAMultipleOf20ThenReturnFalse(){
        assertFalse(Less20.less20(20));
    }
}
