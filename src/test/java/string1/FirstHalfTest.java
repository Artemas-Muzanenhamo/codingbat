package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 *
 * firstHalf("WooHoo") → "Woo"
 * firstHalf("HelloThere") → "Hello"
 * firstHalf("abcdef") → "abc"
 */
public class FirstHalfTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyStringValue(){
        assertEquals("", FirstHalf.firstHalf(""));
    }

    @Test
    public void whenStringIsLessThan2ThenReturnStringAsIs(){
        assertEquals("a", FirstHalf.firstHalf("a"));
    }

    @Test
    public void whenStringLengthPassedInIsEvenThenReturnFirstHalfOfTheString(){
        assertEquals("Woo", FirstHalf.firstHalf("WooHoo"));
    }

}
