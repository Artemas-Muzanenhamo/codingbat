package logic1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/06/2017.
 *
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
 *
 * Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
 *
 * specialEleven(22) → true
 * specialEleven(23) → true
 * specialEleven(24) → false
 */
public class SpecialEvenTest {
    
    private SpecialEven specialEven;
    
    @Before
    public void init(){
        specialEven = new SpecialEven();
    }

    @Test
    public void whenNumberPassedInIsAMultipleOf11ThenReturnTrue(){
        assertTrue(specialEven.specialEven(22));
    }

    @Test
    public void whenNumberPassedInIsOneMoreThanTheMultipleOf11ThenReturnTrue(){
        assertTrue(specialEven.specialEven(23));
        // lazy
        assertFalse(specialEven.specialEven(24));
    }
}
