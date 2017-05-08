package array1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 05/05/2017.
 *
 * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
 *
 * firstLast6([1, 2, 6]) → true
 * firstLast6([6, 1, 2, 3]) → true
 * firstLast6([13, 6, 1, 2, 3]) → false
 */
public class FirstLast6Test {

    int[] arrayCase = {1, 2, 6};
    int[] arrayCase2 = {6, 1, 2, 3};
    int[] arrayCase3 = {13, 6, 1, 2, 3};
    int[] arrayCase4 = {1, 2, 4, 5, 2};
    int[] emptyCase = {};

    @Test
    public void whenAnEmptyArrayIsPassedIsThenReturnFalse(){
        assertFalse(FirstLast6.firstLast6(emptyCase));
    }

    @Test
    public void whenArrayPassedContains6AtTheBeginningThenReturnTrue(){
        assertTrue(FirstLast6.firstLast6(arrayCase2));
    }

    @Test
    public void whenArrayPassedContains6AtTheEndThenReturnTrue(){
        assertTrue(FirstLast6.firstLast6(arrayCase));
    }

    @Test
    public void whenArrayPassedDoesNotHave6AtTheFirstIndexOrLastIndexThenReturnFalse(){
        assertFalse(FirstLast6.firstLast6(arrayCase4));
    }

}
