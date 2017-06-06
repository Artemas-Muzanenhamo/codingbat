package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by artemasm on 06/06/2017.
 *
 * Given an array of ints of even length,
 *
 * return a new array length 2 containing the middle two elements from the original array.
 *
 * The original array will be length 2 or more.
 *
 * makeMiddle([1, 2, 3, 4]) → [2, 3]
 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 * makeMiddle([1, 2]) → [1, 2]
 */
public class MakeMiddleTest {

    private int[] actualArray = {};
    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArray(){
        assertArrayEquals(expectedArray, MakeMiddle.makeMiddle(actualArray));
    }

    @Test
    public void whenAnArrayThatIsOddIsPassedThenReturnArrayAsIs(){

        actualArray = new int[3];
        actualArray[0] = 1;
        actualArray[1] = 2;
        actualArray[2] = 3;

        expectedArray = new int[3];
        expectedArray[0] = 1;
        expectedArray[1] = 2;
        expectedArray[2] = 3;

        assertArrayEquals(expectedArray, MakeMiddle.makeMiddle(actualArray));
    }

    @Test
    public void whenAnEvenArrayIsPassedThenReturnTheTwoMiddleValuesAsAnArray(){

        actualArray = new int[4];
        actualArray[0] = 1;
        actualArray[1] = 2;
        actualArray[2] = 3;
        actualArray[3] = 4;

        expectedArray = new int[2];
        expectedArray[0] = 2;
        expectedArray[1] = 3;

        assertArrayEquals(expectedArray, MakeMiddle.makeMiddle(actualArray));

    }

    @Test
    public void whenAnEvenArrayContainingTwoElementsIsPassedThenReturnTheTwoMiddleValues(){

        actualArray = new int[2];
        actualArray[0] = 1;
        actualArray[1] = 2;

        expectedArray = new int[2];
        expectedArray[0] = 1;
        expectedArray[1] = 2;

        assertArrayEquals(expectedArray, MakeMiddle.makeMiddle(actualArray));
    }
}
