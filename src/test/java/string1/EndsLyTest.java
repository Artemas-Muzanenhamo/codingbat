package string1;

import org.junit.Before;
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
    
    private EndsLy endsLy;
    
    @Before
    public void init(){
        endsLy = new EndsLy();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyValue(){
        assertFalse(endsLy.endsLy(""));
    }

    @Test
    public void whenStringPassedInDoesNotContainLYAndLengthIsLessThan1ThenReturnFalse(){
        assertFalse(endsLy.endsLy("y"));
    }

    @Test
    public void whenStringPassedInDoesNotContainLYThenReturnFalse(){
        assertFalse(endsLy.endsLy("lg"));

    }

    @Test
    public void whenStringPassedInDoesContainLYThenReturnFalse(){
        assertTrue(endsLy.endsLy("ly"));

        //lazy
        assertTrue(endsLy.endsLy("oddly"));

    }


}
