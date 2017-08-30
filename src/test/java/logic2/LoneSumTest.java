package logic2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Artemas on 29/08/2017.
 *
 * Given 3 int values, a b c, return their sum.
 *
 * However,
 *
 * if one of the values is the same as another of the values, it does not count towards the sum.
 *
 * loneSum(1, 2, 3) → 6
 * loneSum(3, 2, 3) → 2
 * loneSum(3, 3, 3) → 0
 */
public class LoneSumTest {

    private LoneSum loneSum;

    @Before
    public void init(){
        loneSum = new LoneSum();
    }

    @Test
    public void whenAllThreeValuesAreNotTheSameThenReturnTheSumOfValuesPassedIn(){
        assertEquals(6, loneSum.loneSum(1, 2, 3));
    }

    @Test
    public void whenTwoValuesAreTheSameThenReturnTheOneDifferentValueAsTheSum(){
        assertEquals(2, loneSum.loneSum(3, 2, 3));

        //lazy
        assertEquals(2, loneSum.loneSum(2, 3, 3));
        assertEquals(2, loneSum.loneSum(3, 3, 2));
    }

    @Test
    public void whenAllTheValuesAreTheSameThenReturnZeroAsTheSum(){
        assertEquals(0, loneSum.loneSum(3, 3, 3));
    }

}
