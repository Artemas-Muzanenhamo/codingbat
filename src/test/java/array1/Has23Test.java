package array1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 09/05/2017.
 *
 * Given an int array length 2, return true if it contains a 2 or a 3.
 *
 * has23([2, 5]) → true
 * has23([4, 3]) → true
 * has23([4, 5]) → false
 */
public class Has23Test {

    private Has23 has23;
    int[] emptyArray = {};
    int[] arrayCase1 = {2};
    int[] arrayCase2 = {2, 5};
    int[] arrayCase3 = {4, 3};
    int[] arrayCase4 = {4, 5};

    @Before
    public void init(){
        has23 = new Has23();
    }

    @Test
    public void whenArrayPassedInIsEmptyThenReturnFalse(){
        assertFalse(has23.has23(emptyArray));
    }

    @Test
    public void whenTheArrayPassedIsLength1ThenReturnFalse(){
        assertFalse(has23.has23(arrayCase1));
    }

    @Test
    public void whenTheArrayPassedIsOfLength2ThenReturnTrueIfTwoOrThreeExistsInTheArray(){
        assertTrue(has23.has23(arrayCase2));

        //lazy
        assertTrue(has23.has23(arrayCase3));
    }

    @Test
    public void whenTheArrayPassedIsOfLength2ThenReturnFalseIfTwoOrThreeDoesNotExistsInTheArray(){
        assertFalse(has23.has23(arrayCase4));
    }

}
