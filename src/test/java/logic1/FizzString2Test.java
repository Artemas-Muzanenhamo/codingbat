package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 30/06/2017.
 *
 * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
 *
 * Except if the number is divisible by 3 use "Fizz" instead of the number,
 *
 * and if the number is divisible by 5 use "Buzz",
 *
 * and if divisible by both 3 and 5, use "FizzBuzz".
 *
 * Note: the % "mod" operator computes the remainder after division,
 * so 23 % 10 yields 3. What will the remainder be when one number divides evenly into another?
 * (See also: FizzBuzz Code and Introduction to Mod)
 *
 * fizzString2(1) → "1!"
 * fizzString2(2) → "2!"
 * fizzString2(3) → "Fizz!"
 */
public class FizzString2Test {
    
    private FizzString2 fizzString2;
    
    @Before
    public void init(){
        fizzString2 = new FizzString2();
    }

    @Test
    public void whenTheNumberPassedInIsNotAMultipleOf3ThenReturnTheNumberStringExclaimed(){
        assertEquals("1!", fizzString2.fizzString(1));
    }

    @Test
    public void whenTheNumberPassedInIsAMultipleOf3ThenReturnFizzExclaimed(){
        assertEquals("Fizz!", fizzString2.fizzString(3));
    }

    @Test
    public void whenTheNumberPassedInIsAMultipleOf5ThenReturnBuzzExclaimed(){
        assertEquals("Buzz!", fizzString2.fizzString(5));
    }

    @Test
    public void whenTheNumberPassedInIsBothDivisibleBy3And5ThenReturnFizzBuzzExclaimed(){
        assertEquals("FizzBuzz!", fizzString2.fizzString(15));
    }

}
