package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
 * The string length will be at least 2.
 *
 * left2("Hello") → "lloHe"
 * left2("java") → "vaja"
 * left2("Hi") → "Hi"
 */
public class Left2Test {
    
    private Left2 left2;
    
    @Before
    public void init(){
        left2 = new Left2();
    }

    @Test
    public void whenEmptyStringIsPassedInThenReturnEmptyValueBack(){
        assertEquals("", left2.left2(""));
    }

    @Test
    public void whenStringPassedInIsOfLength1ThenReturnStringAsIs(){
        assertEquals("A", left2.left2("A"));
    }

    @Test
    public void whenTheStringIsNotEmptyThenReturnTheStringWithTheFirst2CharsAtTheEnd(){
        assertEquals("lloHe", left2.left2("Hello"));
    }

}
