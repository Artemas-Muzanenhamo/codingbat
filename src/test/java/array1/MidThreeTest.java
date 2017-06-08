package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by artemasm on 07/06/2017.
 *
 * Given an array of ints of odd length,
 *
 * return a new array length 3 containing the elements from the middle of the array.
 *
 * The array length will be at least 3.
 *
 * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
 * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
 * midThree([1, 2, 3]) → [1, 2, 3]
 */
public class MidThreeTest {

    private int[] actualArray = {};
    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArray(){
        assertArrayEquals(expectedArray, MidThree.midThree(actualArray));
    }

    @Test
    public void whenAnArrayOfLength2IsPassedThenReturnTheArrayAsIs(){
        actualArray = new int[]{1, 2};
        expectedArray = new int[]{1, 2};

        assertArrayEquals(expectedArray, MidThree.midThree(actualArray));
    }

    @Test
    public void whenAnArrayOfLength3IsPassedThenReturnTheThreeValuesAsIs(){
        actualArray = new int[]{1, 2, 3};
        expectedArray = new int[]{1, 2, 3};

        assertArrayEquals(expectedArray, MidThree.midThree(actualArray));
    }

    @Test
    public void whenArrayOfLength4AndEvenIsPassedThenReturnArrayAsIs(){
        actualArray = new int[]{1, 2, 3, 4};
        expectedArray = new int[]{1, 2, 3, 4};

        assertArrayEquals(expectedArray, MidThree.midThree(actualArray));
    }

    @Test
    public void whenArrayOfLength4IsPassedAndIsOddThenReturnTheMiddleValues(){

        actualArray = new int[]{8, 6, 7, 5, 3, 0, 9};
        expectedArray = new int[]{7, 5, 3};

        assertArrayEquals(expectedArray, MidThree.midThree(actualArray));
    }
}
