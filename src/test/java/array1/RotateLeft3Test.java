package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 *
 * rotateLeft3([1, 2, 3]) → [2, 3, 1]
 * rotateLeft3([5, 11, 9]) → [11, 9, 5]
 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
public class RotateLeft3Test {

    int[] emptyArray = {};
    int[] arrayCase1 = {1, 2, 3};
    int[] expectedCase1 = {2, 3, 1};

    int[] arrayCase2 = {5, 11, 9};
    int[] expectedCase2 = {11, 9, 5};

    int[] arrayCase3 = {7, 0, 0};
    int[] expectedCase3 = {0, 0, 7};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAndEmptyArray(){
        assertArrayEquals(emptyArray, RotateLeft3.rotateLeft3(emptyArray));
    }

    @Test
    public void whenArrayOfLength3IsPassedThenRotateAllElementsToTheLeft(){
        assertArrayEquals(expectedCase1, RotateLeft3.rotateLeft3(arrayCase1));

        //lazy
        assertArrayEquals(expectedCase2, RotateLeft3.rotateLeft3(arrayCase2));
        assertArrayEquals(expectedCase3, RotateLeft3.rotateLeft3(arrayCase3));
    }

}
