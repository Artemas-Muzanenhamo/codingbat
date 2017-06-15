package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Artemas on 15/06/2017.
 *
 * Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 *
 * frontPiece([1, 2, 3]) → [1, 2]
 * frontPiece([1, 2]) → [1, 2]
 * frontPiece([1]) → [1]
 */
public class FrontPeiceTest {

    private int[] actualArray = {};
    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArray(){
        assertArrayEquals(expectedArray, FrontPeice.frontPiece(actualArray));
    }

    @Test
    public void whenAnArrayOfLength1IsPassedThenReturnTheArrayValueAsIs(){

        actualArray = new int[]{1};
        expectedArray = new int[]{1};

        assertArrayEquals(expectedArray, FrontPeice.frontPiece(actualArray));
    }

    @Test
    public void whenAnArrayOfLength2IsPassedThenReturnTheArrayAsIs(){

        actualArray = new int[]{1, 2};
        expectedArray = new int[]{1, 2};

        assertArrayEquals(expectedArray, FrontPeice.frontPiece(actualArray));
    }

    @Test
    public void whenAnArrayOfLengthGreaterThan2ThenReturnTheFirstTwoElementsOfTheArray(){

        actualArray = new int[]{1 ,2 , 3};
        expectedArray = new int[]{1, 2};

        assertArrayEquals(expectedArray, FrontPeice.frontPiece(actualArray));
    }
}
