package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 16/03/2017.
 *
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */
public class StringSplosionTest {

    @Test
    public void whenEmptyStringIsPassedTheReturnEmptyString(){
        assertEquals("", StringSplosion.stringSplosion(""));
    }

    @Test
    public void whenNullStringIsPassedThenReturnEmptyString(){
        assertEquals("", StringSplosion.stringSplosion(null));
    }

    @Test
    public void whenStringABIsPassedthenReturnStringAAB(){
        assertEquals("aab", StringSplosion.stringSplosion("ab"));
    }

    @Test
    public void whenStringCODEIsPassedInThenReturnStringCCoCodCode(){
        assertEquals("CCoCodCode", StringSplosion.stringSplosion("Code"));
    }

    @Test
    public void whenStringABCIsPassedInThenReturnStringAABABC(){
        assertEquals("aababc", StringSplosion.stringSplosion("abc"));
    }
}
