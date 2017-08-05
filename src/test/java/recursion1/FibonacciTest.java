package recursion1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Artemas on 05/08/2017.
 *
 * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
 * The first two values in the sequence are 0 and 1 (essentially 2 base cases).
 * Each subsequent value is the sum of the previous two values,
 * so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
 * Define a recursive fibonacci(n) method that returns the nth fibonacci number,
 * with n=0 representing the start of the sequence.
 *
 * fibonacci(0) → 0
 * fibonacci(1) → 1
 * fibonacci(2) → 1
 */
public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void init(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void when5IsPassedInThenReturnThe5thFibonacciNumber(){
        assertEquals(1, fibonacci.fibonacci(1));
        assertEquals(1, fibonacci.fibonacci(2));
        assertEquals(5, fibonacci.fibonacci(5));
    }
}
