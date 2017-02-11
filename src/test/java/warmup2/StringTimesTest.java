package warmup2;

import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 10/02/2017.
 *
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */

public class StringTimesTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){
        assertEquals("", StringTimes.stringTimes("", 1));
    }

    @Test
    public void whenNonNegative0IsPassedThenReturnEmptyString(){
        assertEquals("", StringTimes.stringTimes("Hi", 0));
    }

    @Test
    public void whenNonNegative1IsPassedThenReturnSameStringCopy(){
        assertEquals("Hi", StringTimes.stringTimes("Hi", 1));
    }

    @Test
    public void whenNonNegative2IsPassedThenReturn2StringCopies(){
        assertEquals("HiHi", StringTimes.stringTimes("Hi", 2));
    }

    @Test
    public void whenNonNegative3IsPassedThenReturn3StringCopies(){
        assertEquals("HiHiHi", StringTimes.stringTimes("Hi", 3));
    }

    @Test
    public void whenNonNegative5IsPassedThenReturn5StringCopies(){
        assertEquals("123123123123123", StringTimes.stringTimes("123", 5));
    }

}
