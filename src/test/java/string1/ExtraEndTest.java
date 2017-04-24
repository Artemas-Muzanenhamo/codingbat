package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
 *
 * extraEnd("Hello") → "lololo"
 * extraEnd("ab") → "ababab"
 * extraEnd("Hi") → "HiHiHi"
 */
public class ExtraEndTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", ExtraEnd.extraEnd(""));
    }

    @Test
    public void whenStringPassedIsLength2ThenReturnStringAsIs(){
        assertEquals("HiHiHi", ExtraEnd.extraEnd("Hi"));
    }

    @Test
    public void whenStringIsPassedAndLengthIs3ThenReturnThreeCopiesOfTheString(){
        assertEquals("rtrtrt", ExtraEnd.extraEnd("Art"));
    }

    @Test
    public void whenStringIsPassedAndLengthIsMoreThanThreeThenReturnThreeCopiesOfTheLastTwoChars(){
        assertEquals("asasas", ExtraEnd.extraEnd("Artemas"));
    }

}
