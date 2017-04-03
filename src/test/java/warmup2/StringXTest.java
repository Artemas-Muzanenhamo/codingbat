package warmup2;

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

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){

        assertEquals("", StringX.stringX(""));

    }

    @Test
    public void whenStringPassedDoesNotContainXThenReturnStringAsIs(){

        assertEquals("Artemas", StringX.stringX("Artemas"));

    }

    @Test
    public void whenStringPassedContainsXAtTheBeginningIndexThenTrimAllTheXAndReturnNewString(){

        assertEquals("xabcd", StringX.stringX("xabxcd"));

    }

    @Test
    public void whenStringPassedDoesNotContainXAtTheBeginningIndexThenTrimAllTheXAndReturnNewString(){

        assertEquals("abcd", StringX.stringX("abxcd"));

    }

    @Test
    public void whenStringPassedContainsXAtTheEndIndexThenTrimAllTheXAndReturnNewString(){

        assertEquals("xabcdx", StringX.stringX("xabxxcdx"));

    }

    @Test
    public void whenASingleStringXIsPassedInThenReturnSingleStringBack(){

        assertEquals("x", StringX.stringX("x"));

    }


}
