package array1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 26/05/2017.
 *
 * Given an int array,
 *
 * return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
 *
 * double23([2, 2]) → true
 * double23([3, 3]) → true
 * double23([2, 3]) → false
 */
public class Double23Test {

    private Double23 double23;
    private int[] array = {};

    @Before
    public void init(){
        double23 = new Double23();
    }

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnFalse(){
        assertFalse(double23.double23(array));
    }

    @Test
    public void whenAnArrayIsPassedInContaining2TwiceThenReturnTrue(){

        array = new int[2];
        array[0] = 2;
        array[1] = 2;

        assertTrue(double23.double23(array));
    }

    @Test
    public void whenAnArrayIsPassedInContaining3TwiceThenReturnTrue(){
        array = new int[2];
        array[0] = 3;
        array[1] = 3;

        assertTrue(double23.double23(array));
    }

    @Test
    public void whenAnArrayIsPassedInContaining4TwiceThenReturnFalse(){

        array = new int[2];
        array[0] = 4;
        array[1] = 4;

        assertFalse(double23.double23(array));

    }
}
