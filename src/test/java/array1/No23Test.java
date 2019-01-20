package array1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by amuzanenhamo on 09/05/2017.
 */
public class No23Test {
    
    private No23 no23;

    private int[] emptyArray = {};
    private int[] arrayCase1 = {2};
    private int[] arrayCase2 = {2, 5};
    private int[] arrayCase3 = {4, 3};
    private int[] arrayCase4 = {4, 5};
    private int[] arrayCase5 = {2, 3};
    
    @Before
    public void setUp() {
        no23 = new No23();
    }

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnFalse(){
        assertTrue(no23.no23(emptyArray));
    }

    @Test
    public void whenTheArrayPassedIsLength1ThenReturnFalse(){
        assertTrue(no23.no23(arrayCase1));
    }

    @Test
    public void whenTheArrayPassedIsOfLength2ThenReturnTrueIfTwoOrThreeExistsInTheArray(){
        assertFalse(no23.no23(arrayCase2));

        //lazy
        assertFalse(no23.no23(arrayCase3));
        assertFalse(no23.no23(arrayCase5));
    }

    @Test
    public void whenTheArrayPassedIsOfLength2ThenReturnFalseIfTwoOrThreeDoesNotExistsInTheArray(){
        assertTrue(no23.no23(arrayCase4));
    }
}
