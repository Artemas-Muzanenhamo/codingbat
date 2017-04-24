package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
 * The string length will be at least 2.
 *
 * right2("Hello") → "loHel"
 * right2("java") → "vaja"
 * right2("Hi") → "Hi"
 */
public class Right2Test {

    @Test
    public void whenStringPassedInIsEmptyThenReturnEmptyValue(){
        assertEquals("", Right2.right2(""));
    }

    @Test
    public void whenStringPassedInIsOfLength1ThenReturnStringAsIs(){
        assertEquals("A", Right2.right2("A"));
    }

    @Test
    public void whenStringPassedInIsLength2ThenReturnStringAsIs(){
        assertEquals("Hi", Right2.right2("Hi"));
    }

    @Test
    public void whenStringPassedInIsBiggerThanLength2ThenReturnStringWithTheLast2CharsAtTheBeginning(){
        assertEquals("vaja", Right2.right2("java"));

        //lazy
        assertEquals("loHel", Right2.right2("Hello"));
    }
}
