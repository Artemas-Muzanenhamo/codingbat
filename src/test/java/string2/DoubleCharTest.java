package string2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 26/07/2017.
 *
 * Given a string, return a string where for every char in the original, there are two chars.
 *
 * doubleChar("The") → "TThhee"
 * doubleChar("AAbb") → "AAAAbbbb"
 * doubleChar("Hi-There") → "HHii--TThheerree"
 */
public class DoubleCharTest {

    @Test
    public void whenASingleStringIsPassedThenReturnTheStringDuplicated(){
        assertEquals("aa", DoubleChar.doubleChar("a"));
    }

    @Test
    public void whenAWordIsPassedThenReturnWordCharactersDuplicated(){
        assertEquals("aarrtteemmaass", DoubleChar.doubleChar("artemas"));

        //lazy
        assertEquals("TThhee", DoubleChar.doubleChar("The"));
        assertEquals("AAAAbbbb", DoubleChar.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", DoubleChar.doubleChar("Hi-There"));
    }

}
