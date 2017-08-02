package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 30/06/2017.
 *
 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
 *
 * twoAsOne(1, 2, 3) → true
 * twoAsOne(3, 1, 2) → true
 * twoAsOne(3, 2, 2) → false
 */
public class TwoAsOneTest {
    
    private TwoAsOne twoAsOne;
    
    @Before
    public void init(){
        twoAsOne = new TwoAsOne();
    }

    @Test
    public void whenTheFirstTwoIntegersAreEqualToTheThirdNumberThenReturnTrue(){
        assertTrue(twoAsOne.twoAsOne(1, 2, 3));
    }

    @Test
    public void whenTheFirstAndTheLastIntegersAreEqualToTheMiddleNumberThenReturnTrue(){
        assertTrue(twoAsOne.twoAsOne(1, 3, 2));
    }

    @Test
    public void whenTheMiddleAndTheLastIntegersAreEqualToTheFirstNumberThenReturnTrue(){
        assertTrue(twoAsOne.twoAsOne(3, 2, 1));
    }

}
