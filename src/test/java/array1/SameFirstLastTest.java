package array1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
 *
 * sameFirstLast([1, 2, 3]) → false
 * sameFirstLast([1, 2, 3, 1]) → true
 * sameFirstLast([1, 2, 1]) → true
 */
public class SameFirstLastTest {

    int[] arrayCase = {1, 2, 1};
    int[] arrayCase2 = {6, 1, 2, 3};
    int[] emptyCase = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnFalse(){
        assertFalse(SameFirstLast.sameFirstLast(emptyCase));
    }

    @Test
    public void whenArrayPassedHasTheSameNumberAtTheFirstIndexAndLastIndexThenReturnTrue(){
        assertTrue(SameFirstLast.sameFirstLast(arrayCase));
    }

    @Test
    public void whenArrayPassedHasADifferentNumberOnTheFirstIndexAndLastIndexThenReturnFalse(){
        assertFalse(SameFirstLast.sameFirstLast(arrayCase2));
    }
}
