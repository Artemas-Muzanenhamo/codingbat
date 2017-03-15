package warmup2;

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

    @Test
    public void whenAnEmptyStringIsPassedThenReturnEmptyValue(){
        assertFalse(DoubleX.doubleX(""));
    }

    @Test
    public void whenAnNonEmptyStringIsPassedReturnTrue(){
        assertTrue(DoubleX.doubleX("Helloxx"));
    }

    @Test
    public void whenStringDoesNotContainXXThenReturnFalse(){
        assertFalse(DoubleX.doubleX("Hello"));
    }

    @Test
    public void whenFirstInstanceOfStringDoesNotContainXXThenReturnFalse(){
        assertFalse(DoubleX.doubleX("axaxax"));
    }

    @Test
    public void whenFirstInstanceOfStringContainsXXThenReturnTrue(){
        assertTrue(DoubleX.doubleX("axxbb"));
    }

    @Test
    public void whenLastInstanceOfStringContainsXXThenReturnFalse(){
        assertFalse(DoubleX.doubleX("axbbxx"));
    }

}
