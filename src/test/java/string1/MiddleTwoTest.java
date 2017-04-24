package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
 *
 * middleTwo("string") → "ri"
 * middleTwo("code") → "od"
 * middleTwo("Practice") → "ct"
 */
public class MiddleTwoTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", MiddleTwo.middleTwo(""));
    }

    @Test
    public void whenStringPassedIsOfLength1ThenReturnStringAsIs(){
        assertEquals("X", MiddleTwo.middleTwo("X"));
    }

    @Test
    public void whenStringPassedInIsOfEvenLengthThenReturnTheMiddleCharsOfTheString(){
        assertEquals("od", MiddleTwo.middleTwo("code"));

        //lazy
        assertEquals("ri", MiddleTwo.middleTwo("String"));
        assertEquals("ct", MiddleTwo.middleTwo("Practice"));
    }

}
