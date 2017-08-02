package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 04/07/2017.
 *
 * Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
 *
 * lessBy10(1, 7, 11) → true
 * lessBy10(1, 7, 10) → false
 * lessBy10(11, 1, 7) → true
 */
public class LessBy10Test {
    
    private LessBy10 lessBy10;
    
    @Before
    public void init(){
        lessBy10 = new LessBy10();
    }

    @Test
    public void whenTheFirstTwoNumbersAre10OrMoreLessThenReturnTrue(){
        assertTrue(lessBy10.lessBy10(11, 1, 7));
    }

    @Test
    public void whenTheLastTwoNumbersAreTenOrMoreLessThenReturnTrue(){
        assertTrue(lessBy10.lessBy10(7, 1, 11));
    }

    @Test
    public void whenTheFirstAndLastNumbersAreTenOrMoreLessThenReturnTrue(){
        assertTrue(lessBy10.lessBy10(1, 7, 11));
    }

    @Test
    public void whenTheFirstTwoNumbersAreNotTenOrMoreLessThenReturnFalse(){
        assertFalse(lessBy10.lessBy10(10, 1, 7));
    }

    @Test
    public void whenTheLastTwoNumbersAreNotTenOrMoreLessThenReturnFalse(){
        assertFalse(lessBy10.lessBy10(7, 1, 10));
    }

    @Test
    public void whenTheFirstAndLastNumbersAreNotTenOrMoreLessThenReturnFalse(){
        assertFalse(lessBy10.lessBy10(1, 7, 10));
    }
}
