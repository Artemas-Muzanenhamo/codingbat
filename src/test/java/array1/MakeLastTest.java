package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 26/05/2017.
 *
 * Given an int array,
 *
 * return a new array with double the length where its last element is the same as the original array,
 * and all the other elements are 0.
 *
 * The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
 *
 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
 * makeLast([1, 2]) → [0, 0, 0, 2]
 * makeLast([3]) → [0, 3]
 */
public class MakeLastTest {

    private int[] actualArray = {};
    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnEmptyArray(){
        assertArrayEquals(expectedArray, MakeLast.makeLast(actualArray));
    }

    @Test
    public void whenAnArrayIsPassedAndContainsOneValueThenReturnAnArrayDoubleTheLengthWithItsLastElement(){

        actualArray = new int[1];
        actualArray[0] = 3;

        expectedArray = new int[2];
        expectedArray[0] = 0;
        expectedArray[1] = 3;

        assertArrayEquals(expectedArray, MakeLast.makeLast(actualArray));

    }

    @Test
    public void whenAnArrayWithTwoValuesIsPassedThenReturnArrayAsExpected(){ //lazy naming ;)

        actualArray = new int[2];
        actualArray[0] = 1;
        actualArray[1] = 2;

        expectedArray = new int[4];
        expectedArray[0] = 0;
        expectedArray[1] = 0;
        expectedArray[2] = 0;
        expectedArray[3] = 2;

        assertArrayEquals(expectedArray, MakeLast.makeLast(actualArray));

    }

    @Test
    public void whenAnArrayWithThreeOrMoreValuesIsPassedThenReturnArrayAsExpected(){

        actualArray = new int[3];
        actualArray[0] = 4;
        actualArray[1] = 5;
        actualArray[2] = 6;

        expectedArray = new int[6];
        expectedArray[0] = 0;
        expectedArray[1] = 0;
        expectedArray[2] = 0;
        expectedArray[3] = 0;
        expectedArray[4] = 0;
        expectedArray[5] = 6;

        assertArrayEquals(expectedArray, MakeLast.makeLast(actualArray));

    }

}
