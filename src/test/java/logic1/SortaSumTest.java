package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by artemasm on 26/06/2017.
 *
 * Given 2 ints, a and b, return their sum.
 *
 * However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
 *
 * sortaSum(3, 4) → 7
 * sortaSum(9, 4) → 20
 * sortaSum(10, 11) → 21
 */
public class SortaSumTest {
    
    private SortaSum sortaSum;
    
    @Before
    public void init(){
        sortaSum = new SortaSum();
    }

    @Test
    public void whenSumOfIntegersPassedInIsNotInTheRangeOf10To19ThenReturnSumValue(){
        assertEquals(9, sortaSum.sortaSum(5, 4));
    }

    @Test
    public void whenSumOfIntegersPassedInIsInTheRangeOf10To19ThenReturn20(){
        assertEquals(20, sortaSum.sortaSum(9, 4));
    }

    @Test
    public void whenSumOfIntegersPassedInIsAboveTheRangeOf10To19ThenReturnTheSumValue(){
        assertEquals(40, sortaSum.sortaSum(20, 20));
    }
}
