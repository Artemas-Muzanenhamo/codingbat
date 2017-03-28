package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 28/03/2017.
 *
 * Given an array of ints, return the number of 9's in the array.
 *
 * arrayCount9([1, 2, 9]) → 1
 * arrayCount9([1, 9, 9]) → 2
 * arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public class ArrayCount9Test {

    @Test
    public void whenEmptyArrayIsPassedThenReturnZero(){

        int[] nums = {0, 0, 0};

        assertEquals(0, ArrayCount.arrayCount(nums));
    }

    @Test
    public void whenArrayContainOne9ThenReturnCountEqualsToOne(){

        int[] nums = {1, 2, 9};

        assertEquals(1, ArrayCount.arrayCount(nums));
    }

    @Test
    public void whenArrayContainsTwo9sThenReturnCountEqualsToTwo(){

        int[] nums = {1, 9, 9};

        assertEquals(2, ArrayCount.arrayCount(nums));

    }

    @Test
    public void whenArrayContainsThree9sThenReturnCountEqualsToThree(){

        int[] nums = {1, 9, 9, 3, 9};

        assertEquals(3, ArrayCount.arrayCount(nums));
    }

    @Test
    public void whenArrayDoesNotContainAny9sThenReturnCountEqualsToZero(){

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        assertEquals(0, ArrayCount.arrayCount(nums));
    }

}
