package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Artemas on 16/06/2017.
 *
 * Given 2 int arrays, a and b, of any length,
 *
 * return a new array with the first element of each array.
 *
 * If either array is length 0, ignore that array.
 *
 * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
 * front11([1], [2]) → [1, 2]
 * front11([1, 7], []) → [1]
 */
public class Front11Test {

    private int[] a = {};
    private int[] b = {};

    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArrayValue(){
        assertArrayEquals(expectedArray, Front11.front11(a, b));
    }

    @Test
    public void whenTheLeftArrayIsEmptyThenReturnTheValueOfTheRightArray(){

        b = new int[]{1, 2, 3};

        expectedArray = new int[]{1};

        assertArrayEquals(expectedArray, Front11.front11(a, b));
    }

    @Test
    public void whenTheRightArrayIsEmptyThenReturnTheValueOfTheLeftArray(){

        a = new int[]{1, 2, 3};

        expectedArray = new int[]{1};

        assertArrayEquals(expectedArray, Front11.front11(a, b));
    }

    @Test
    public void whenBothArraysArePassedInThenReturnTheFirstElementsAsAnArray(){

        a = new int[]{1, 2, 3};
        b = new int[]{4, 5, 6};

        expectedArray = new int[]{1, 4};

        assertArrayEquals(expectedArray, Front11.front11(a, b));
    }

}
