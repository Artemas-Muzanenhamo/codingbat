package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).
 *
 * comboString("Hello", "hi") → "hiHellohi"
 * comboString("hi", "Hello") → "hiHellohi"
 * comboString("aaa", "b") → "baaab"
 */
public class ComboStringTest {

    @Test
    public void whenEmptyStringsArePassedInThenReturnEmptyStringValue(){
        assertEquals("", ComboString.comboString("", ""));
    }

    @Test
    public void whenOneStringIsEmptyThenReturnTheStringWithAValue(){
        assertEquals("Artemas", ComboString.comboString("", "Artemas"));

        //lazy
        assertEquals("Takudzwa", ComboString.comboString("Takudzwa", ""));
    }

    @Test
    public void whenStringsPassedThenReturnStringInFormatShortLongShort(){
        assertEquals("HiArtemasHi", ComboString.comboString("Hi", "Artemas"));

        //lazy
        assertEquals("baaab", ComboString.comboString("aaa", "b"));
    }

}
