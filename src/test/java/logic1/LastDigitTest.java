package logic1;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 03/07/2017.
 *
 * Given three ints, a b c, return true
 *
 * if two or more of them have the same rightmost digit.
 *
 * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
 *
 * lastDigit(23, 19, 13) → true
 * lastDigit(23, 19, 12) → false
 * lastDigit(23, 19, 3) → true
 */
public class LastDigitTest {

    @Test
    public void whenTheFirstTwoNumbersHaveTheRightMostDigitThenReturnTrue(){
        assertTrue(LastDigit.lastDigit(23, 13, 9));
    }

    @Test
    public void whenTheFirstAndLastNumbersHaveTheRightMostDigitThenReturnTrue(){
        assertTrue(LastDigit.lastDigit(23, 19, 13));
    }

}
