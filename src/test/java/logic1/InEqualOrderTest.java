package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 30/06/2017.
 *
 * Given three ints, a b c,
 *
 * return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
 *
 * However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
 *
 * inOrderEqual(2, 5, 11, false) → true
 * inOrderEqual(5, 7, 6, false) → false
 * inOrderEqual(5, 5, 7, true) → true
 */
public class InEqualOrderTest {
    
    private InEqualOrder inEqualOrder;
    
    @Before
    public void init(){
        inEqualOrder = new InEqualOrder();
    }

    @Test
    public void whenAllNumbersAreInIncreasingOrderAndEqualOkIsFalseThenReturnTrue(){
        assertTrue(inEqualOrder.inEqualOrder(1, 2, 3, false));
    }

    @Test
    public void whenAllNumbersAreDecreasingOrderAndEqualOkIsFalseThenReturnFalse(){
        assertFalse(inEqualOrder.inEqualOrder(3, 2, 1, false));
    }

    @Test
    public void whenTheLastNumberIsSmallerThanTheMiddleNumberAndEqualOkIsFalseThenReturnFalse(){
        assertFalse(inEqualOrder.inEqualOrder(4, 6, 2, false));
    }

    @Test
    public void whenBothNumbersAreEqualAndTheLastNumberIsGreaterAndEqualOkIsTrueThenReturnTrue(){
        assertTrue(inEqualOrder.inEqualOrder(1, 1, 2, true));
    }

    @Test
    public void whenBothNumbersAreEqualAndTheLastNumberIsGreaterAndEqualOkIsFalseThenReturnFalse(){
        assertFalse(inEqualOrder.inEqualOrder(1, 1, 2, false));
    }



}
