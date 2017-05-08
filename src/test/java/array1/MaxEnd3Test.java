package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value.
 * Return the changed array.
 *
 * maxEnd3([1, 2, 3]) → [3, 3, 3]
 * maxEnd3([11, 5, 9]) → [11, 11, 11]
 * maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class MaxEnd3Test {

    int[] emptyArray = {};

    int[] arrayCase1 = {1, 2, 3};
    int[] arrayCase2 = {11, 5, 9};
    int[] arrayCase3 = {2, 11, 3};

    int[] expectedCase1 = {3, 3, 3};
    int[] expectedCase2 = {11, 11, 11};
    int[] expectedCase3 = {3, 3, 3};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArrayValue(){
        assertArrayEquals(emptyArray, MaxEnd3.maxEnd3(emptyArray));
    }

    @Test
    public void whenAnArrayOfLength3IsPassedAndTheFirstCharIsLargerThanTheLastThenReturnArrayMadeUpOfTheLargestValue(){
        assertArrayEquals(expectedCase2, MaxEnd3.maxEnd3(arrayCase2));
    }

    @Test
    public void whenAnArrayOfLength3IsPassedAndTheLastCharIsLargerThanTheFirstThenReturnArrayMadeUpOfTheLargestValue(){
        assertArrayEquals(expectedCase1, MaxEnd3.maxEnd3(arrayCase1));

        //lazy
        assertArrayEquals(expectedCase3, MaxEnd3.maxEnd3(arrayCase3));
    }
}
