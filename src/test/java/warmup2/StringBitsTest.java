package warmup2;

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

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){
        assertEquals("", StringBits.stringBits(""));
    }

    @Test
    public void whenStringIsNullThenReturnEmptyString(){
        assertEquals("", StringBits.stringBits(null));
    }

    @Test
    public void whenA2CharStringIsPassedThenReturnTheFirstCharacter(){
        assertEquals("H", StringBits.stringBits("Hi"));
    }

    @Test
    public void whenAHeeololeoStringIsPassedThenReturnTheEvenCharacters(){
        assertEquals("Hello", StringBits.stringBits("Heeololeo"));
    }

    @Test
    public void whenHelloStringIsPassedThenReturn(){
        assertEquals("Hlo", StringBits.stringBits("Hello"));
    }

}
