package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 28/06/2017.
 *
 * Given 2 ints, a and b, return their sum.
 *
 * However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
 *
 * teenSum(3, 4) → 7
 * teenSum(10, 13) → 19
 * teenSum(13, 2) → 19
 */
public class TeenSumTest {
    
    private TeenSum teenSum;
    
    @Before
    public void init(){
        teenSum = new TeenSum();
    }

    @Test
    public void whenTwoIntegersArePassedInThenReturnTheirSum(){
        assertEquals(7, teenSum.teenSum(3, 4));
    }

    @Test
    public void whenTheLeftIntegersPassedInContainsATeenValueThenReturn19(){
        assertEquals(19, teenSum.teenSum(13, 4));
    }

    @Test
    public void whenTheRightIntegersPassedInContainsATeenValueThenReturn19(){
        assertEquals(19, teenSum.teenSum(3, 14));
    }

}
