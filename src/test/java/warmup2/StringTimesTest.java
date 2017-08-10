package warmup2;

import org.junit.Assert.*;
import org.junit.Before;
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

    private StringTimes stringTimes;

    @Before
    public void init(){
        stringTimes = new StringTimes();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){
        assertEquals("", stringTimes.stringTimes("", 1));
    }

    @Test
    public void whenNonNegative0IsPassedThenReturnEmptyString(){
        assertEquals("", stringTimes.stringTimes("Hi", 0));
    }

    @Test
    public void whenNonNegative1IsPassedThenReturnSameStringCopy(){
        assertEquals("Hi", stringTimes.stringTimes("Hi", 1));
    }

    @Test
    public void whenNonNegative2IsPassedThenReturn2StringCopies(){
        assertEquals("HiHi", stringTimes.stringTimes("Hi", 2));
    }

    @Test
    public void whenNonNegative3IsPassedThenReturn3StringCopies(){
        assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));
    }

    @Test
    public void whenNonNegative5IsPassedThenReturn5StringCopies(){
        assertEquals("123123123123123", stringTimes.stringTimes("123", 5));
    }

}
