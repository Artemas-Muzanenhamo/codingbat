package logic1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/06/2017.
 *
 * Given a number n, return true if n is in the range 1..10, inclusive.
 *
 * Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
 *
 * in1To10(5, false) → true
 * in1To10(11, false) → false
 * in1To10(11, true) → true
 */
public class In1To10Test {

    @Test
    public void whenNumberIsInTheRangeOf10AndNotInOutsideModeThenReturnTrue(){
        assertTrue(In1To10.in1To10(5, false));
        // lazy
        assertTrue(In1To10.in1To10(10, false));
        assertTrue(In1To10.in1To10(1, false));
    }

    @Test
    public void whenNumberIsNotInTheRangeOf10AndNotInOutsideModeThenReturnFalse(){
        assertFalse(In1To10.in1To10(0, false));
        // lazy
        assertFalse(In1To10.in1To10(11, false));
    }

    @Test
    public void whenNumberIsNotInTheRangeOf10AndInOutsideModeThenReturnTrue(){
        assertTrue(In1To10.in1To10(20, true));
    }

    @Test
    public void whenNumberIsInTheRangeOf10AndInOutsideModeThenReturnFalse(){
        assertFalse(In1To10.in1To10(5, true));
    }
}
