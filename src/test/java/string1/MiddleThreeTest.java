package string1;

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

    @Test
    public void whenAnEmptyStringIsPassedThenReturnAnEmptyValue(){
        assertEquals("", MiddleThree.middleThree(""));
    }

    @Test
    public void whenStringPassedHasLengthLessThan3ThenReturnTheStringValueAsIs(){
        assertEquals("Hi", MiddleThree.middleThree("Hi"));
    }

    @Test
    public void whenStringPassedInHasLength3ThenReturnStringAsIs(){
        assertEquals("Art", MiddleThree.middleThree("Art"));
    }

    @Test
    public void whenStringIsPassedInAndIsOddThenReturnMiddle3Chars(){
        assertEquals("and", MiddleThree.middleThree("Candy"));

        //lazy
        assertEquals("lvi", MiddleThree.middleThree("solving"));
    }

}
