package logic1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/06/2017.
 *
 * The number 6 is a truly great number.
 *
 * Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6.
 *
 * Note: the function Math.abs(num) computes the absolute value of a number.
 *
 * love6(6, 4) → true
 * love6(4, 5) → false
 * love6(1, 5) → true
 */
public class Love6Test {

    private Love6 love6;

    @Before
    public void init(){
        love6 = new Love6();
    }

    @Test
    public void whenOneValueHasTheValue6ThenReturnTrue(){
        assertTrue(love6.love6(6, 4));
        // lazy
        assertTrue(love6.love6(4, 6));
    }

    @Test
    public void whenSumOfTheTwoValuesAddsUpTo6ThenReturnTrue(){
        assertTrue(love6.love6(1, 5));
        // lazy
        assertTrue(love6.love6(5, 1));
    }

    @Test
    public void whenTheDifferenceOfTheTwoValuesAddsUpTo6ThenReturnTrue(){
        assertTrue(love6.love6(1, 7));
        // lazy
        assertTrue(love6.love6(8, 2));
    }
}
