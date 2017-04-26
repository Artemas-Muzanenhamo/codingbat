package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 27/04/2017.
 *
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
 *
 * conCat("abc", "cat") → "abcat"
 * conCat("dog", "cat") → "dogcat"
 * conCat("abc", "") → "abc"
 */
public class ConCatTest {

    @Test
    public void whenEmptyStringsArePassedInThenReturnEmptyValues(){
        assertEquals("", ConCat.conCat("", ""));
    }

    @Test
    public void whenLeftStringIsPassedThenReturnLeftConcatenatedString(){
        assertEquals("cat", ConCat.conCat("cat", ""));
    }

    @Test
    public void whenRightStringIsPassedThenReturnRightConcatenatedString(){
        assertEquals("dog", ConCat.conCat("", "dog"));
    }

    @Test
    public void whenStringsArePassedInThenReturnConcatenatedString(){
        assertEquals("dogcat", ConCat.conCat("dog", "cat"));

        //lazy
        assertEquals("abcat", ConCat.conCat("abc", "cat"));
    }
}
