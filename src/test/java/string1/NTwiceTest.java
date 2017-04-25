package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 25/04/2017.
 *
 * Given a string and an int n, return a string made of the first and last n chars from the string.
 * The string length will be at least n.
 *
 * nTwice("Hello", 2) → "Helo"
 * nTwice("Chocolate", 3) → "Choate"
 * nTwice("Chocolate", 1) → "Ce"
 */
public class NTwiceTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", NTwice.nTwice("", 0));
    }

    @Test
    public void whenIntNIsZeroThenReturnEmptyValue(){
        assertEquals("", NTwice.nTwice("Artemas", 0));
    }

    @Test
    public void whenStringIsPassedInWithTheIntNThenReturnTheStringValueMadeOfTheFirstAndLastChars(){
        assertEquals("Helo", NTwice.nTwice("Hello", 2));

        //lazy
        assertEquals("Choate", NTwice.nTwice("Chocolate", 3));
        assertEquals("Ce", NTwice.nTwice("Chocolate", 1));
    }
}
