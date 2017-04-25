package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 25/04/2017.
 *
 * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
 *
 * atFirst("hello") → "he"
 * atFirst("hi") → "hi"
 * atFirst("h") → "h@"
 */
public class AtFirstTest {

    @Test
    public void whenAnEmptyStringIsPassedThenReturnDoubleATSymbols(){
        assertEquals("@@", AtFirst.atFirst(""));
    }

    @Test
    public void whenStringPassedInHasLength1ThenReturnTheStringWithTheATSymbol(){
        assertEquals("h@", AtFirst.atFirst("h"));
    }

    @Test
    public void whenStringPassedInHasLength2ThenReturnStringAsIs(){
        assertEquals("Hi", AtFirst.atFirst("Hi"));
    }

    @Test
    public void whenStringPassedInHasLengthMoreThan2ThenReturnTheFirst2Chars(){
        assertEquals("He", AtFirst.atFirst("Hello"));
    }
}
