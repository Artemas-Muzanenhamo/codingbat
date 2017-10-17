package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 05/05/2017.
 *
 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
 * This is a little harder than it looks.
 *
 * withoutX2("xHi") → "Hi"
 * withoutX2("Hxi") → "Hi"
 * withoutX2("Hi") → "Hi"
 */
public class WithoutX2Test {
    
    private WithoutX2 withoutX2;
    
    @Before
    public void init(){
        withoutX2 = new WithoutX2();
    }

    @Test
    public void whenEmptyStringIsPassedInThenReturnEmptyValue(){
        assertEquals("", withoutX2.withoutX2(""));
    }

    @Test
    public void whenStringOfLengthOneIsPassedPlusContainingXThenReturnEmptyValue(){
        assertEquals("", withoutX2.withoutX2("x"));
    }

    @Test
    public void whenStringOfLength2ContainsXAtBothIndex1And2ThenReturnEmptyValue(){
        assertEquals("", withoutX2.withoutX2("xx"));
    }

    @Test
    public void whenStringPassedInContainsXAtSecondIndexThenRemoveCharXInString(){
        assertEquals("Hi", withoutX2.withoutX2("Hxi"));

        //lazy
        assertEquals("Hix", withoutX2.withoutX2("xHix"));
    }
}
