package recursion1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Artemas on 03/08/2017.
 *
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
 *
 * factorial(1) → 1
 * factorial(2) → 2
 * factorial(3) → 6
 */
public class FactorialTest {

    private Factorial factorial;

    @Before
    public void init(){
        factorial = new Factorial();
    }

    @Test
    public void when3IsPassedThenReturnFactorial_6_(){
        assertEquals(6, factorial.factorial(3));
    }

    @Test
    public void when4IsPassedThenReturnFactorial_24_(){
        assertEquals(24, factorial.factorial(4));
    }
}
