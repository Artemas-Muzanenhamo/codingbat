package string1;

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

    @Test
    public void whenEmptyStringIsPassedInThenReturnEmptyValueBack(){
        assertEquals("", Left2.left2(""));
    }

    @Test
    public void whenStringPassedInIsOfLength1ThenReturnStringAsIs(){
        assertEquals("A", Left2.left2("A"));
    }

    @Test
    public void whenTheStringIsNotEmptyThenReturnTheStringWithTheFirst2CharsAtTheEnd(){
        assertEquals("lloHe", Left2.left2("Hello"));
    }

}
