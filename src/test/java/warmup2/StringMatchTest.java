package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 28/03/2017.
 *
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
 *
 * stringMatch("xxcaazz", "xxbaaz") → 3
 * stringMatch("abc", "abc") → 2
 * stringMatch("abc", "axc") → 0
 */
public class StringMatchTest {

    @Test
    public void whenEmptyStringArePassedThenReturnZero(){
        assertEquals(0, StringMatch.stringMatch("", ""));
    }

    @Test
    public void whenLeftStringIsEmptyThenReturnZero(){
        assertEquals(0, StringMatch.stringMatch("", "xxbaaz"));
    }

    @Test
    public void whenRightStringIsEmptyThenReturnZero(){
        assertEquals(0, StringMatch.stringMatch("xxbaaz", ""));
    }

    @Test
    public void whenSubstringAppearsInBothLeftAndRightStringThenReturnCount(){
        assertEquals(3, StringMatch.stringMatch("xxcaazz", "xxbaaz"));

        //lazy me...
        assertEquals(2, StringMatch.stringMatch("abc", "abc"));
    }

    @Test
    public void whenBothStringDoNotMatchInBothLeftAndRightStringThenReturnZero(){
        assertEquals(0, StringMatch.stringMatch("abc", "axc"));
    }

}
