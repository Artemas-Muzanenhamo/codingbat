package warmup2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 16/03/2017.
 *
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */
public class StringBitsTest {
    
    private StringBits stringBits;
    
    @Before
    public void init(){
        stringBits = new StringBits();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){
        assertEquals("", stringBits.stringBits(""));
    }

    @Test
    public void whenStringIsNullThenReturnEmptyString(){
        assertEquals("", stringBits.stringBits(null));
    }

    @Test
    public void whenA2CharStringIsPassedThenReturnTheFirstCharacter(){
        assertEquals("H", stringBits.stringBits("Hi"));
    }

    @Test
    public void whenAHeeololeoStringIsPassedThenReturnTheEvenCharacters(){
        assertEquals("Hello", stringBits.stringBits("Heeololeo"));
    }

    @Test
    public void whenHelloStringIsPassedThenReturn(){
        assertEquals("Hlo", stringBits.stringBits("Hello"));
    }

}
