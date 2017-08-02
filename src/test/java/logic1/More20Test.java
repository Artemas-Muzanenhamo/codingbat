package logic1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/06/2017.
 *
 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
 *
 * more20(20) → false
 * more20(21) → true
 * more20(22) → true
 */
public class More20Test {
    
    private More20 more20;
    
    @Before
    public void init(){
        more20 = new More20();
    }

    @Test
    public void whenTheNumberPassedInIsAMultipleOf20ThenReturnFalse(){
        assertFalse(more20.more20(20));
    }

    @Test
    public void whenTheNumberPassedInIs1MoreThanTheMultipleOf20ThenReturnTrue(){
        assertTrue(more20.more20(21));
        // lazy
        assertTrue(more20.more20(101));
    }

    @Test
    public void whenTheNumberPassedInIs2MoreThanTheMultipleOf20ThenReturnTrue(){
        assertTrue(more20.more20(22));
        // lazy
        assertTrue(more20.more20(102));
    }
}
