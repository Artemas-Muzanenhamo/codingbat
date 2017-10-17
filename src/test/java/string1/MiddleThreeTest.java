package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 25/04/2017.
 *
 * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
 *
 * middleThree("Candy") → "and"
 * middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 */
public class MiddleThreeTest {
    
    private MiddleThree middleThree;
    
    @Before
    public void init(){
        middleThree = new MiddleThree();
    }

    @Test
    public void whenAnEmptyStringIsPassedThenReturnAnEmptyValue(){
        assertEquals("", middleThree.middleThree(""));
    }

    @Test
    public void whenStringPassedHasLengthLessThan3ThenReturnTheStringValueAsIs(){
        assertEquals("Hi", middleThree.middleThree("Hi"));
    }

    @Test
    public void whenStringPassedInHasLength3ThenReturnStringAsIs(){
        assertEquals("Art", middleThree.middleThree("Art"));
    }

    @Test
    public void whenStringIsPassedInAndIsOddThenReturnMiddle3Chars(){
        assertEquals("and", middleThree.middleThree("Candy"));

        //lazy
        assertEquals("lvi", middleThree.middleThree("solving"));
    }

}
