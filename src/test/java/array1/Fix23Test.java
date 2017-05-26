package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 26/05/2017.
 *
 * Given an int array length 3,
 *
 * if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
 *
 * fix23([1, 2, 3]) → [1, 2, 0]
 * fix23([2, 3, 5]) → [2, 0, 5]
 * fix23([1, 2, 1]) → [1, 2, 1]
 */
public class Fix23Test {

    private int[] actualArray = {};
    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArrayBack(){
        assertArrayEquals(expectedArray, Fix23.fix23(actualArray));
    }

    @Test
    public void whenAnArrayOfLength2IsPassedThenReturnTheArrayAsIs(){

        actualArray = new int[2];
        actualArray[0] = 1;
        actualArray[1] = 2;

        expectedArray = new int[2];
        expectedArray[0] = 1;
        expectedArray[1] = 2;

        assertArrayEquals(expectedArray, Fix23.fix23(actualArray));
    }

    @Test
    public void whenAnArrayOfLength3IsPassedAndContainsA2FollowedByA3AtIndex1ThenReplaceThe3WithZeroInTheArray(){

        actualArray = new int[3];
        actualArray[0] = 1;
        actualArray[1] = 2;
        actualArray[2] = 3;

        expectedArray = new int[3];
        expectedArray[0] = 1;
        expectedArray[1] = 2;
        expectedArray[2] = 0;

        assertArrayEquals(expectedArray, Fix23.fix23(actualArray));
    }

    public void whenAnArrayOfLength3IsPassedAndContainsA2FollowedByA3AtIndex0ThenReplaceThe3WithZeroInTheArray(){

        actualArray = new int[3];
        actualArray[0] = 2;
        actualArray[1] = 3;
        actualArray[2] = 5;

        expectedArray = new int[3];
        expectedArray[0] = 2;
        expectedArray[1] = 0;
        expectedArray[2] = 5;

        assertArrayEquals(expectedArray, Fix23.fix23(actualArray));
    }

}
