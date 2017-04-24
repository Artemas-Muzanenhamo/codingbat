package string1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string, return true if it ends in "ly".
 *
 * endsLy("oddly") → true
 * endsLy("y") → false
 * endsLy("oddy") → false
 */
public class EndsLyTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertFalse(EndsLy.endsLy(""));
    }

    @Test
    public void whenStringPassedInDoesNotContainLYAndLengthIsLessThan1ThenReturnFalse(){
        assertFalse(EndsLy.endsLy("y"));
    }

    @Test
    public void whenStringPassedInDoesNotContainLYThenReturnFalse(){
        assertFalse(EndsLy.endsLy("lg"));

    }

    @Test
    public void whenStringPassedInDoesContainLYThenReturnFalse(){
        assertTrue(EndsLy.endsLy("ly"));

        //lazy
        assertTrue(EndsLy.endsLy("oddly"));

    }


}
