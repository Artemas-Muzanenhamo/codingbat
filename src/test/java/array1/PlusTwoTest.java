package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by artemasm on 06/06/2017.
 *
 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
 *
 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
 * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
public class PlusTwoTest {

    private int[] firstActualArray = {};
    private int[] secondActualArray = {};
    private int[] expectedArray = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArray(){
        assertArrayEquals(expectedArray, PlusTwo.plusTwo(firstActualArray, secondActualArray));
    }

    @Test
    public void whenBothArraysArePassedThenReturnANewArrayContainingAllElements(){

        firstActualArray = new int[2];
        secondActualArray = new int[2];

        firstActualArray[0] = 1;
        firstActualArray[1] = 2;
        secondActualArray[0] = 3;
        secondActualArray[1] = 4;

//        expectedArray = new int[4];
        expectedArray = new int[]{1, 2, 3, 4};

        assertArrayEquals(expectedArray, PlusTwo.plusTwo(firstActualArray, secondActualArray));
    }

}
