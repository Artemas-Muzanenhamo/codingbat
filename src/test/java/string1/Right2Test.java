package string1;

import org.junit.Before;
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
    
    private Right2 right2;
    
    @Before
    public void init(){
        right2 = new Right2();
    }

    @Test
    public void whenStringPassedInIsEmptyThenReturnEmptyValue(){
        assertEquals("", right2.right2(""));
    }

    @Test
    public void whenStringPassedInIsOfLength1ThenReturnStringAsIs(){
        assertEquals("A", right2.right2("A"));
    }

    @Test
    public void whenStringPassedInIsLength2ThenReturnStringAsIs(){
        assertEquals("Hi", right2.right2("Hi"));
    }

    @Test
    public void whenStringPassedInIsBiggerThanLength2ThenReturnStringWithTheLast2CharsAtTheBeginning(){
        assertEquals("vaja", right2.right2("java"));

        //lazy
        assertEquals("loHel", right2.right2("Hello"));
    }
}
