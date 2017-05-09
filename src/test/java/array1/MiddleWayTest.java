package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 09/05/2017.
 *
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
 *
 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
public class MiddleWayTest {

    int[] emptyArray = {};
    int[] arrayCase1 = {1, 2, 3};
    int[] arrayCase2 = {4, 5, 6};
    int[] arrayCase3 = {7, 7, 7};
    int[] arrayCase4 = {3, 8, 0};
    int[] arrayCase5 = {5, 2, 9};

    int[] expectedCase1 = {2,5};
    int[] expectedCase2 = {5,7};
    int[] expectedCase3 = {8,2};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArray(){
        assertArrayEquals(emptyArray, MiddleWay.middleWay(emptyArray, emptyArray));
    }

    @Test
    public void whenBothArraysArePassedThenReturnTheMiddleElements(){
        assertArrayEquals(expectedCase1, MiddleWay.middleWay(arrayCase1, arrayCase2));

        //lazy
        assertArrayEquals(expectedCase2, MiddleWay.middleWay(arrayCase2, arrayCase3));
        assertArrayEquals(expectedCase3, MiddleWay.middleWay(arrayCase4, arrayCase5));
    }

}
