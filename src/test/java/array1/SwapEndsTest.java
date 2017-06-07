package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by artemasm on 07/06/2017.
 *
 * Given an array of ints,
 *
 * swap the first and last elements in the array.
 *
 * Return the modified array.
 *
 * The array length will be at least 1.
 *
 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
 * swapEnds([1, 2, 3]) → [3, 2, 1]
 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */
public class SwapEndsTest {

    private int[] firstActualArray = {};
    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAndEmptyArray(){
        assertArrayEquals(expectedArray, SwapEnds.swapEnds(firstActualArray));
    }

    @Test
    public void whenAnArraysIsPassedThenReturnASwappedArrayOfTheFirstAndLastElements(){

        firstActualArray = new int[]{4, 3};
        expectedArray = new int[]{3, 4};

        assertArrayEquals(expectedArray, SwapEnds.swapEnds(firstActualArray));


    }

    @Test
    public void whenAnArrayOfLargerLengthIsPassedThenReturnSwappedElementsOfTheFirstAndLastElement(){

        firstActualArray = new int[]{1, 2, 3, 4, 5};
        expectedArray = new int[]{5, 2, 3, 4, 1};

        assertArrayEquals(expectedArray, SwapEnds.swapEnds(firstActualArray));

    }

}
