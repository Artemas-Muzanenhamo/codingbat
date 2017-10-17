package string1;

import org.junit.Before;
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
    
    private MiddleTwo middleTwo;
    
    @Before
    public void init(){
        middleTwo = new MiddleTwo();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", middleTwo.middleTwo(""));
    }

    @Test
    public void whenStringPassedIsOfLength1ThenReturnStringAsIs(){
        assertEquals("X", middleTwo.middleTwo("X"));
    }

    @Test
    public void whenStringPassedInIsOfEvenLengthThenReturnTheMiddleCharsOfTheString(){
        assertEquals("od", middleTwo.middleTwo("code"));

        //lazy
        assertEquals("ri", middleTwo.middleTwo("String"));
        assertEquals("ct", middleTwo.middleTwo("Practice"));
    }

}
