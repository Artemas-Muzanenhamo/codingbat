package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 28/03/2017.
 *
 * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 *
 * array123([1, 1, 2, 3, 1]) → true
 * array123([1, 1, 2, 4, 1]) → false
 * array123([1, 1, 2, 1, 2, 3]) → true
 */
public class Array123Test {

    @Test
    public void whenArrayIsEmptyThenReturnFalse(){

        int[] nums = {};

        assertEquals(false, Array123.arrayCount123(nums));
    }

    @Test
    public void whenArrayContains12And3ThenReturnTrue(){

        int[] nums = {1, 2, 3, 1};

        assertTrue(Array123.arrayCount123(nums));
    }

    @Test
    public void whenArrayContainsMultipla12And3ThenReturnTrue(){

        int[] nums = {1, 1, 2, 1, 2, 3};

        assertTrue(Array123.arrayCount123(nums));
    }

    @Test
    public void whenArrayDoesNotContain12And3ThenReturnFalse(){

        int[] nums = {1, 2, 4, 2};

        assertFalse(Array123.arrayCount123(nums));
    }
}
