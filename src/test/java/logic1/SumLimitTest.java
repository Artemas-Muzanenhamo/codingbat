package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 07/07/2017.
 *
 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
 *
 * If the sum has more digits than a, just return a without b.
 *
 * (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)
 *
 * sumLimit(2, 3) → 5
 * sumLimit(8, 3) → 8
 * sumLimit(8, 1) → 9
 */
public class SumLimitTest {

    @Test
    public void whenTheTwoValuesArePassedThenReturnTheSumIfItHasTheSameValueAs_a(){
        assertEquals(5, SumLimit.sumLimit(2, 3));
    }

    @Test
    public void whenTheSumHasMoreDigitsThan_A_ThenReturnAWithout_B_(){
        assertEquals(8, SumLimit.sumLimit(8, 3));
    }
}
