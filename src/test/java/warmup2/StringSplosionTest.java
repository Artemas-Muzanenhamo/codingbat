package warmup2;

import org.junit.Before;
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

    private StringSplosion stringSplosion;

    @Before
    public void init(){
        stringSplosion = new StringSplosion();
    }

    @Test
    public void whenEmptyStringIsPassedTheReturnEmptyString(){
        assertEquals("", stringSplosion.stringSplosion(""));
    }

    @Test
    public void whenNullStringIsPassedThenReturnEmptyString(){
        assertEquals("", stringSplosion.stringSplosion(null));
    }

    @Test
    public void whenStringABIsPassedthenReturnStringAAB(){
        assertEquals("aab", stringSplosion.stringSplosion("ab"));
    }

    @Test
    public void whenStringCODEIsPassedInThenReturnStringCCoCodCode(){
        assertEquals("CCoCodCode", stringSplosion.stringSplosion("Code"));
    }

    @Test
    public void whenStringABCIsPassedInThenReturnStringAABABC(){
        assertEquals("aababc", stringSplosion.stringSplosion("abc"));
    }
}
