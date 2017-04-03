package warmup2;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 03/04/2017.
 *
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 *
 * arrayFront9([1, 2, 9, 3, 4]) → true
 * arrayFront9([1, 2, 3, 4, 9]) → false
 * arrayFront9([1, 2, 3, 4, 5]) → false
 */
public class ArrayFront9Test {

    @Test
    public void whenArrayPassedInIsEmptyThenReturnFalse(){
        int[] arr = {};

        assertFalse(ArrayFront9.arrayFront9(arr));
    }

    @Test
    public void whenArrayIsLessThan4ElementsAndContains9ThenReturnTrue(){
        int[] arr = {1, 2, 9};

        assertTrue(ArrayFront9.arrayFront9(arr));
    }

    @Test
    public void whenArrayIsLessThan4ElementsAndDoesNotContain9ThenReturnFalse(){
        int[] arr = {1, 2, 4};

        assertFalse(ArrayFront9.arrayFront9(arr));
    }

    @Test
    public void whenArrayIsMoreThan4ElementsAndDoesContain9InTheFirst4ElementsThenReturnTrue(){
        int[] arr = {1, 2, 6, 9, 7, 7, 6, 3};

        assertTrue(ArrayFront9.arrayFront9(arr));
    }

    @Test
    public void whenArrayIsMoreThan4ElementsAndDoesNotContain9InTheFirst4ElementsThenReturnFalse(){
        int[] arr = {1, 4, 5, 7, 0, 7, 6, 5, 4, 9 };

        assertFalse(ArrayFront9.arrayFront9(arr));
    }

    @Test
    public void whenArrayIsMoreThan4ElementsAndDoesNotContain9InTheWholeElementThenReturnFalse(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};

        assertFalse(ArrayFront9.arrayFront9(arr));

    }

}
