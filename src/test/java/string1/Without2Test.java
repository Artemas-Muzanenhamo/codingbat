package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 04/05/2017.
 *
 * Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
 * The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
 *
 * without2("HelloHe") → "lloHe"
 * without2("HelloHi") → "HelloHi"
 * without2("Hi") → ""
 */
public class Without2Test {

    @Test
    public void whenAnEmptyStringIsPassedThenReturnAnEmptyValue() {
        assertEquals("", Without2.without2(""));
    }

    @Test
    public void whenStringPassedIsLengthLessThan2ThenReturnStringAsIs(){
        assertEquals("A", Without2.without2("A"));
    }

    @Test
    public void whenStringPassedDoesNotHaveTheSameCharsAtTheEndThenReturnStringAsIs(){
        assertEquals("Artemas", Without2.without2("Artemas"));
    }

    @Test
    public void whenStringPassedInIsOfLength2ThenReturnAnEmptyValue(){
        assertEquals("", Without2.without2("Hi"));
    }

    @Test
    public void whenStringPassedDoesHaveTheSameCharsAtTheEndThenReturnStringMinusTheFirstTwoChars(){
        assertEquals("lloHe", Without2.without2("HelloHe"));
    }


}