package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 30/06/2017.
 *
 * Given three ints, a b c,
 *
 * return true if b is greater than a, and c is greater than b.
 *
 * However, with the exception that if "bOk" is true, b does not need to be greater than a.
 *
 * inOrder(1, 2, 4, false) → true
 * inOrder(1, 2, 1, false) → false
 * inOrder(1, 1, 2, true) → true
 */
public class InOrderTest {

    private InOrder inOrder;

    @Before
    public void init(){
        inOrder = new InOrder();
    }

    @Test
    public void whenBIsGreaterThanAAndBOKIsFalseThenReturnTrue(){
        assertTrue(inOrder.inOrder(1, 2, 4, false));
    }

    @Test
    public void whenBIsLessThanAAndBOKIsFalseThenReturnFalse(){
        assertFalse(inOrder.inOrder(4, 2, 4, false));
    }

    @Test
    public void whenCIsGreaterThanBAndBOKIsFalseThenReturnTrue(){
        assertTrue(inOrder.inOrder(1, 2, 4, false));
    }

    @Test
    public void whenCIsLessThanBAndBOKIsFalseThenReturnFalse(){
        assertFalse(inOrder.inOrder(1, 4, 3, false));
    }

    @Test
    public void whenBIsLessThanAAndBOKIsTrueThenReturnTrue(){
        assertTrue(inOrder.inOrder(5, 4, 7, true));
    }
}
