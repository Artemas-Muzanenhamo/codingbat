package logic2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Artemas on 04/09/2017.
 *
 * Given 3 int values, a b c, return their sum. However,
 *
 * - if one of the values is 13 then it does not count towards the sum and values to its right do not count.
 *
 * So for example, if b is 13, then both b and c do not count.
 *
 * luckySum(1, 2, 3) → 6
 * luckySum(1, 2, 13) → 3
 * luckySum(1, 13, 3) → 1
 */
public class LuckySumTest {

    private LuckySum luckySum;

    @Before
    public void init(){
        luckySum = new LuckySum();
    }

    @Test
    public void whenAllTheNumbersAreNot13ThenReturnTheSumOfAllNumbers(){
        assertEquals(6, luckySum.luckySum(1, 2, 3));
    }

    @Test
    public void whenTheLastNumberIsEqualTo13ThenReturnTheSumOfTheFirstTwoNumbers(){
        assertEquals(3, luckySum.luckySum(1, 2, 13));
    }

    @Test
    public void whenTheSecondNumberIsEqualTo13TheReturnTheFirstNumberOnly(){
        assertEquals(1, luckySum.luckySum(1, 13, 2));
    }

    @Test
    public void whenTheFirstNumberIsEqualTo13ThenReturnZero(){
        assertEquals(0, luckySum.luckySum(13, 2, 3));

        assertEquals(0, luckySum.luckySum(13, 2, 13));
    }
}
