package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 05/05/2017.
 *
 * Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 *
 * withoutX("xHix") → "Hi"
 * withoutX("xHi") → "Hi"
 * withoutX("Hxix") → "Hxi"
 */
public class WithoutXTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", WithoutX.withoutX(""));
    }

    @Test
    public void whenStringXIsPassedThenReturnEmptyValue(){
        assertEquals("", WithoutX.withoutX("x"));
    }

    @Test
    public void whenStringPassedContainsTwoXXBothFrontAndBackThenReturnEmptyString(){
        assertEquals("", WithoutX.withoutX("xx"));
    }

    @Test
    public void whenStringPassedInDoesNotContainAnyXValuesAtTheBeginningAndEndThenReturnAsIs(){
        assertEquals("Artemas", WithoutX.withoutX("Artemas"));
    }

    @Test
    public void whenStringPassedContainsXAtBothFirstCharAndLastCharThenReturnStringWithoutXs(){
        assertEquals("Artemas", WithoutX.withoutX("xArtemasx"));

        //lazy
        assertEquals("Hxi", WithoutX.withoutX("Hxix"));
        assertEquals("Hi", WithoutX.withoutX("xHix"));
        assertEquals("Hi", WithoutX.withoutX("xHi"));
    }
}
