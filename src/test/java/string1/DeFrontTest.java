package string1;

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

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertEquals("", DeFront.deFront(""));
    }

    @Test
    public void whenFirstCharIsAThenReturnStringValueA(){
        assertEquals("a", DeFront.deFront("a"));
    }

    @Test
    public void whenTheSecondCharIsBThenReturnStringValueB(){
        assertEquals("b", DeFront.deFront("tb"));
    }

    @Test
    public void whenStringPassedInContainsAPlusBAsFirst2CharsThenReturnAB(){
        assertEquals("ab", DeFront.deFront("ab"));
    }

    @Test
    public void whenStringIsPassedAndDoesNotContainAPlusBAtFirstThenReturnStringWithoutTheFirst2Chars(){
        assertEquals("llo", DeFront.deFront("Hello"));

        //lazy
        assertEquals("va", DeFront.deFront("java"));
    }

    @Test
    public void whenStringIsPassedAndContainsAPlusBAtFirstThenReturnStringWithTheFirst2Chars(){
        assertEquals("aay", DeFront.deFront("away"));

        //lazy
        assertEquals("abel", DeFront.deFront("abel"));
        assertEquals("atemas", DeFront.deFront("artemas"));
    }
}
