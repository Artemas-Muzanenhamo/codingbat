package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 11/02/2017.
 *
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 * or whatever is there if the string is less than length 3. Return n copies of the front;
 *
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class FrontTimesTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){

        assertEquals("", FrontTimes.frontTimes("", 1));

    }

    @Test
    public void whenStringLengthIsLessThan3ThenReturnStringAsIs(){

        assertEquals("Hi", FrontTimes.frontTimes("Hi", 1));

    }

    @Test
    public void whenNonNegative0IsPassedThenReturnEmptyString(){

        assertEquals("", FrontTimes.frontTimes("Hello", 0));

    }

    @Test
    public void whenStringAbcIsPassedThenReturnCopiesNTimes(){

        assertEquals("ChoCho", FrontTimes.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", FrontTimes.frontTimes("Chocolate", 3));

    }

    @Test
    public void whenNonNegative4IsPassedAndStringIsSingleLetterThenReturnCopiesOfString(){

        assertEquals("AAAA", FrontTimes.frontTimes("A", 4));

    }



}
