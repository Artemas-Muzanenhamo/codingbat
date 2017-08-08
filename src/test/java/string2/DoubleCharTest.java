package string2;

import org.junit.Before;
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
    
    private DoubleChar doubleChar;
    
    @Before
    public void init(){
        doubleChar = new DoubleChar();
    }

    @Test
    public void whenASingleStringIsPassedThenReturnTheStringDuplicated(){
        assertEquals("aa", doubleChar.doubleChar("a"));
    }

    @Test
    public void whenAWordIsPassedThenReturnWordCharactersDuplicated(){
        assertEquals("aarrtteemmaass", doubleChar.doubleChar("artemas"));

        //lazy
        assertEquals("TThhee", doubleChar.doubleChar("The"));
        assertEquals("AAAAbbbb", doubleChar.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", doubleChar.doubleChar("Hi-There"));
    }

}
