package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 30/06/2017.
 *
 * Given a string str,
 *
 * if the string starts with "f" return "Fizz".
 *
 * If the string ends with "b" return "Buzz".
 *
 * If both the "f" and "b" conditions are true, return "FizzBuzz".
 *
 * In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 *
 * fizzString("fig") → "Fizz"
 * fizzString("dib") → "Buzz"
 * fizzString("fib") → "FizzBuzz"
 */
public class FizzStringTest {

    private FizzString fizzString;

    @Before
    public void init(){
        fizzString = new FizzString();
    }

    @Test
    public void whenStringPassedInStartsWithFThenReturnFizz(){
        assertEquals("Fizz", fizzString.fizzString("fig"));
    }

    @Test
    public void whenStringPassedInEndsWithBThenReturnBuzz(){
        assertEquals("Buzz", fizzString.fizzString("dib"));
    }

    @Test
    public void whenStringPassedInContainsBothFAndBThenReturnFizzBuzz(){
        assertEquals("FizzBuzz", fizzString.fizzString("fib"));
    }

}
