package array1;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 09/05/2017.
 */
public class No23Test {

    int[] emptyArray = {};
    int[] arrayCase1 = {2};
    int[] arrayCase2 = {2, 5};
    int[] arrayCase3 = {4, 3};
    int[] arrayCase4 = {4, 5};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnFalse(){
        assertTrue(No23.no23(emptyArray));
    }

    @Test
    public void whenTheArrayPassedIsLength1ThenReturnFalse(){
        assertTrue(No23.no23(arrayCase1));
    }

    @Test
    public void whenTheArrayPassedIsOfLength2ThenReturnTrueIfTwoOrThreeExistsInTheArray(){
        assertFalse(No23.no23(arrayCase2));

        //lazy
        assertFalse(No23.no23(arrayCase3));
    }

    @Test
    public void whenTheArrayPassedIsOfLength2ThenReturnFalseIfTwoOrThreeDoesNotExistsInTheArray(){
        assertTrue(No23.no23(arrayCase4));
    }
}
