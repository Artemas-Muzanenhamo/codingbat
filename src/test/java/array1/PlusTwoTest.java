package array1;

import org.junit.Before;
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

    private PlusTwo plusTwo;
    private int[] firstActualArray = {};
    private int[] secondActualArray = {};
    private int[] expectedArray = {};
    
    @Before
    public void setup() {
        plusTwo = new PlusTwo();
    }

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArray(){
        assertArrayEquals(expectedArray, plusTwo.plusTwo(firstActualArray, secondActualArray));
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

        assertArrayEquals(expectedArray, plusTwo.plusTwo(firstActualArray, secondActualArray));
    }

    @Test
    public void when_both_arrays_are_length_1_then_return_an_empty_array() {
        firstActualArray = new int[1];
        secondActualArray = new int[1];

        firstActualArray[0] = 1;
        secondActualArray[0] = 2;

        expectedArray = new int[]{};

        assertArrayEquals(expectedArray, plusTwo.plusTwo(firstActualArray, secondActualArray));
    }

}
