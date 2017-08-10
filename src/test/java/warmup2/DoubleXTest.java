package warmup2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


/**
 * Created by amuzanenhamo on 15/03/2017.
 *
 *
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */
public class DoubleXTest {
    
    private DoubleX doubleX;
    
    @Before
    public void init(){
        doubleX = new DoubleX();
    }

    @Test
    public void whenAnEmptyStringIsPassedThenReturnEmptyValue(){
        assertFalse(doubleX.doubleX(""));
    }

    @Test
    public void whenAnNonEmptyStringIsPassedReturnTrue(){
        assertTrue(doubleX.doubleX("Helloxx"));
    }

    @Test
    public void whenStringDoesNotContainXXThenReturnFalse(){
        assertFalse(doubleX.doubleX("Hello"));
    }

    @Test
    public void whenFirstInstanceOfStringDoesNotContainXXThenReturnFalse(){
        assertFalse(doubleX.doubleX("axaxax"));
    }

    @Test
    public void whenFirstInstanceOfStringContainsXXThenReturnTrue(){
        assertTrue(doubleX.doubleX("axxbb"));
    }

    @Test
    public void whenLastInstanceOfStringContainsXXThenReturnFalse(){
        assertFalse(doubleX.doubleX("axbbxx"));
    }

}
