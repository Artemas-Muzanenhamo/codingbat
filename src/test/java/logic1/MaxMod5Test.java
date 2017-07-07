package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 07/07/2017.
 *
 * Given two int values, return whichever value is larger.
 *
 * However if the two values have the same remainder when divided by 5, then the return the smaller value.
 *
 * However, in all cases, if the two values are the same, return 0.
 *
 * Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
 *
 * maxMod5(2, 3) → 3
 * maxMod5(6, 2) → 6
 * maxMod5(3, 2) → 3
 */
public class MaxMod5Test {

    @Test
    public void whenTheLeftValuePassedIsGreaterThanTheRightValueThenReturnTheGreaterValue(){
        assertEquals(6, MaxMod5.maxMod5(6, 2));
    }

    @Test
    public void whenTheRightValuePassedIsGreaterThanTheLeftValueThenReturnTheGreaterValue(){
        assertEquals(6, MaxMod5.maxMod5(3, 6));
    }

    @Test
    public void whenBothValuesHaveTheSameRemainderWhenDividedBy5ThenReturnTheSmallerValue(){
        assertEquals(3, MaxMod5.maxMod5(3, 8));
    }

    @Test
    public void whenBothValuesAreTheSameAndHaveTheSameRemainderThenReturn0(){
        assertEquals(0, MaxMod5.maxMod5(7, 7));
    }
}
