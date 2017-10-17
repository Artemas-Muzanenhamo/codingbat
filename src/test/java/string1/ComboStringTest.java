package string1;

import org.junit.Before;
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

    private ComboString comboString;

    @Before
    public void init(){
        comboString = new ComboString();
    }

    @Test
    public void whenEmptyStringsArePassedInThenReturnEmptyStringValue(){
        assertEquals("", comboString.comboString("", ""));
    }

    @Test
    public void whenOneStringIsEmptyThenReturnTheStringWithAValue(){
        assertEquals("Artemas", comboString.comboString("", "Artemas"));

        //lazy
        assertEquals("Takudzwa", comboString.comboString("Takudzwa", ""));
    }

    @Test
    public void whenStringsPassedThenReturnStringInFormatShortLongShort(){
        assertEquals("HiArtemasHi", comboString.comboString("Hi", "Artemas"));

        //lazy
        assertEquals("baaab", comboString.comboString("aaa", "b"));
    }

}
