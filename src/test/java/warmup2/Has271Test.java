package warmup2;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 22/04/2017.
 *
 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1.
 * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
 *
 * has271([1, 2, 7, 1]) → true
 * has271([1, 2, 8, 1]) → false
 * has271([2, 7, 1]) → true
 */
public class Has271Test {

    @Test
    public void whenEmptyArrayIsPassedThenReturnFalse(){
        int[] arr = {};
        assertFalse(Has271.has271(arr));
    }

    @Test
    public void whenArrayLengthIsLessThan3ThenReturnFalse(){
        int[] arr = {1, 2};
        assertFalse(Has271.has271(arr));
    }

    @Test
    public void whenArrayDoesNotHave271ThenReturnFalse(){
        int[] arr = {1, 2, 3, 4, 5};
        assertFalse(Has271.has271(arr));
    }

    @Test
    public void whenArrayDoesNotHave271AndLengthIs3ThenReturnFalse(){
        int[] arr = {1, 2, 3};
        assertFalse(Has271.has271(arr));
    }

    @Test
    public void whenArrayHas271AndLengthIs3ThenReturnTrue(){
        int[] arr = {2, 7, 1};
        assertTrue(Has271.has271(arr));
    }

    @Test
    public void whenArrayHas271ThenReturnTrue(){
        int[] arr = {1, 2, 3, 2, 7, 1};
        assertTrue(Has271.has271(arr));
    }

}
