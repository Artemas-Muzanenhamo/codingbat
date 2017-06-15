package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 08/06/2017.
 *
 * Given an array of ints of odd length,
 *
 * look at the first, last, and middle values in the array and return the largest.
 *
 * The array length will be a least 1.
 *
 * maxTriple([1, 2, 3]) → 3
 * maxTriple([1, 5, 3]) → 5
 * maxTriple([5, 2, 3]) → 5
 */
public class MaxTripleTest {

    int[] array = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnZero(){
        assertEquals(0, MaxTriple.maxTriple(array));
    }

    @Test
    public void whenAnArrayOfLengthOneIsPassedTheNumber(){

        array = new int[]{1};

        assertEquals(1, MaxTriple.maxTriple(array));
    }

    @Test
    public void whenAnArrayOfLengthTwoIsPassedThenReturnZero(){

        array = new int[]{1, 2};

        assertEquals(0, MaxTriple.maxTriple(array));

    }

    @Test
    public void whenAnArrayOfOddLengthIsPassedThenReturnTheLargestValueInTheArray(){

        array = new int[]{1, 2, 3};

        assertEquals(3, MaxTriple.maxTriple(array));

    }
}
