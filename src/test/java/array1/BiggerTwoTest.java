package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 26/05/2017.
 *
 * Start with 2 int arrays, a and b, each length 2.
 *
 * Consider the sum of the values in each array.
 *
 * Return the array which has the largest sum. In event of a tie, return a.
 *
 * biggerTwo([1, 2], [3, 4]) → [3, 4]
 * biggerTwo([3, 4], [1, 2]) → [3, 4]
 * biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
public class BiggerTwoTest {

    private int[] actualArray1 = {};
    private int[] actualArray2 = {};
    private int[] expectedArray1 = {};

    @Test
    public void whenEmptyArraysArePassedInTheReturnTheFirstArrayValue(){

        assertArrayEquals(actualArray1, BiggerTwo.biggerTwo(actualArray1, actualArray2));

    }

    @Test
    public void whenTheLeftArrayIsPassedWithValuesAndTheRightIsntThenReturnTheLeftArray(){

        actualArray1 = new int[2];
        actualArray1[0] = 1;
        actualArray1[1] = 2;

        expectedArray1 = new int[2];
        expectedArray1[0] = 1;
        expectedArray1[1] = 2;

        assertArrayEquals(expectedArray1, BiggerTwo.biggerTwo(actualArray1, actualArray2));

    }

    @Test
    public void whenTheRightArrayIsPassedWithValuesAndTheLeftIsntThenReturnTheRightArray(){

        actualArray2 = new int[2];
        actualArray2[0] = 4;
        actualArray2[1] = 5;

        expectedArray1 = new int[2];
        expectedArray1[0] = 4;
        expectedArray1[1] = 5;

        assertArrayEquals(expectedArray1, BiggerTwo.biggerTwo(actualArray1, actualArray2));

    }

}
