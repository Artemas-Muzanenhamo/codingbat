package array1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
 * Both arrays will be length 1 or more.
 *
 * commonEnd([1, 2, 3], [7, 3]) → true
 * commonEnd([1, 2, 3], [7, 3, 2]) → false
 * commonEnd([1, 2, 3], [1, 3]) → true
 */
public class CommonEndTest {

    int[] arrayCase = {1, 2, 3};
    int[] arrayCase2 = {7, 3};
    int[] arrayCase3 = {7, 3, 2};
    int[] arrayCase4 = {1, 3};
    int[] emptyArray = {};

    @Test
    public void whenEmptyArraysArePassedThenReturnFalse(){
        assertFalse(CommonEnd.commonEnd(emptyArray, emptyArray));
    }

    @Test
    public void whenRightArrayIsPassedButLeftArrayIsEmptyThenReturnFalse(){
        assertFalse(CommonEnd.commonEnd(arrayCase, emptyArray));
    }

    @Test
    public void whenLeftArrayIsPassedButRightArrayIsEmptyThenReturnFalse(){
        assertFalse(CommonEnd.commonEnd(emptyArray, arrayCase));
    }

    @Test
    public void whenArraysHaveTheSameFirstElementThenReturnTrue(){
        assertTrue(CommonEnd.commonEnd(arrayCase, arrayCase4));
    }

    @Test
    public void whenArraysHaveTheSameLastElementThenReturnTrue(){
        assertTrue(CommonEnd.commonEnd(arrayCase2, arrayCase4));
    }

    @Test
    public void whenArraysHaveNoFirstOrLastElementsInCommonThenReturnFalse(){
        assertFalse(CommonEnd.commonEnd(arrayCase3, arrayCase));
    }
}
