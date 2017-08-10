package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 03/04/2017.
 *
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
 *
 * stringX("xxHxix") → "xHix"
 * stringX("abxxxcd") → "abcd"
 * stringX("xabxxxcdx") → "xabcdx"
 */
public class StringXTest {
    
    private StringX stringX;
    
    @Before
    public void init(){
        stringX = new StringX();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){

        assertEquals("", stringX.stringX(""));

    }

    @Test
    public void whenStringPassedDoesNotContainXThenReturnStringAsIs(){

        assertEquals("Artemas", stringX.stringX("Artemas"));

    }

    @Test
    public void whenStringPassedContainsXAtTheBeginningIndexThenTrimAllTheXAndReturnNewString(){

        assertEquals("xabcd", stringX.stringX("xabxcd"));

    }

    @Test
    public void whenStringPassedDoesNotContainXAtTheBeginningIndexThenTrimAllTheXAndReturnNewString(){

        assertEquals("abcd", stringX.stringX("abxcd"));

    }

    @Test
    public void whenStringPassedContainsXAtTheEndIndexThenTrimAllTheXAndReturnNewString(){

        assertEquals("xabcdx", stringX.stringX("xabxxcdx"));

    }

    @Test
    public void whenASingleStringXIsPassedInThenReturnSingleStringBack(){

        assertEquals("x", stringX.stringX("x"));

    }


}
