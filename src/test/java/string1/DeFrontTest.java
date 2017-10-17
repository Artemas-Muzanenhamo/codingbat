package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 04/05/2017.
 *
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length. Harder than it looks.
 *
 * deFront("Hello") → "llo"
 * deFront("java") → "va"
 * deFront("away") → "aay"
 */
public class DeFrontTest {
    
    public DeFront deFront;
    
    @Before
    public void init(){
        deFront = new DeFront();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", deFront.deFront(""));
    }

    @Test
    public void whenFirstCharIsAThenReturnStringValueA(){
        assertEquals("a", deFront.deFront("a"));
    }

    @Test
    public void whenTheSecondCharIsBThenReturnStringValueB(){
        assertEquals("b", deFront.deFront("tb"));
    }

    @Test
    public void whenStringPassedInContainsAPlusBAsFirst2CharsThenReturnAB(){
        assertEquals("ab", deFront.deFront("ab"));
    }

    @Test
    public void whenStringIsPassedAndDoesNotContainAPlusBAtFirstThenReturnStringWithoutTheFirst2Chars(){
        assertEquals("llo", deFront.deFront("Hello"));

        //lazy
        assertEquals("va", deFront.deFront("java"));
    }

    @Test
    public void whenStringIsPassedAndContainsAPlusBAtFirstThenReturnStringWithTheFirst2Chars(){
        assertEquals("aay", deFront.deFront("away"));

        //lazy
        assertEquals("abel", deFront.deFront("abel"));
        assertEquals("atemas", deFront.deFront("artemas"));
    }
}
