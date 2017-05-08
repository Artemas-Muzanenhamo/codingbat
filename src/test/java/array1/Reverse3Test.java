package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 *
 * reverse3([1, 2, 3]) → [3, 2, 1]
 * reverse3([5, 11, 9]) → [9, 11, 5]
 * reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class Reverse3Test {

    int[] emptyArray = {};

    int[] arrayCase1 = {1, 2, 3};
    int[] arrayCase2 = {5, 11, 9};
    int[] arrayCase3 = {7, 0, 0};

    int[] expectedCase1 = {3, 2, 1};
    int[] expectedCase2 = {9, 11, 5};
    int[] expectedCase3 = {0, 0, 7};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturn(){
        assertArrayEquals(emptyArray, Reverse3.reverse3(emptyArray));
    }

    @Test
    public void whenArrayOfLength3IsPassedThenReturnElementsInReverseOrder(){
        assertArrayEquals(expectedCase1, Reverse3.reverse3(arrayCase1));

        //lazy
        assertArrayEquals(expectedCase2, Reverse3.reverse3(arrayCase2));
        assertArrayEquals(expectedCase3, Reverse3.reverse3(arrayCase3));
    }
}
