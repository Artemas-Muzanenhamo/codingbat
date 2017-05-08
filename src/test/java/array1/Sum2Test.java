package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Given an array of ints, return the sum of the first 2 elements in the array.
 * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
 *
 * sum2([1, 2, 3]) → 3
 * sum2([1, 1]) → 2
 * sum2([1, 1, 1, 1]) → 2
 */
public class Sum2Test {

    int[] emptyArray = {};
    int[] arrayCase1 = {1, 2, 3};
    int[] arrayCase2 = {5};
    int[] arrayCase3 = {1, 1};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturn0(){
        assertEquals(0, Sum2.sum2(emptyArray));
    }

    @Test
    public void whenAnArrayOfLengthOneIsPassedThenReturnArrayValueAsIs(){
        assertEquals(5, Sum2.sum2(arrayCase2));
    }

    @Test
    public void whenAnArrayOfLengthTwoIsPassedThenReturnTheSumOfTheTwoValues(){
        assertEquals(2, Sum2.sum2(arrayCase3));
    }

    @Test
    public void whenAnArrayOfLengthMoreThanTwoIsPassedThenReturnTheSumOfTheFirstTwoElements(){
        assertEquals(3, Sum2.sum2(arrayCase1));
    }

}
