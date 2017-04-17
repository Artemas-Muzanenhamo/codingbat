package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 16/04/2017.
 *
 * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
 *
 * stringYak("yakpak") → "pak"
 * stringYak("pakyak") → "pak"
 * stringYak("yak123ya") → "123ya"
 */
public class StringYakTest {

    @Test
    public void whenStringIsEmptyThenReturnEmptyString(){
        assertEquals("", StringYak.stringYakPak(""));
    }

    @Test
    public void whenStringIsLessThan3InLengthThenReturnStringAsIs(){
        assertEquals("Hi", StringYak.stringYakPak("Hi"));
    }

    @Test
    public void whenStringDoesNotContainYakThenReturnStringAsIs(){
        assertEquals("123ya", StringYak.stringYakPak("123ya"));
        assertEquals("yaArtemas", StringYak.stringYakPak("yaArtemas"));
    }

    @Test
    public void whenStringContainsYakThenReturnStringMinusYak(){
        assertEquals("123ya", StringYak.stringYakPak("yak123ya"));
    }
}
