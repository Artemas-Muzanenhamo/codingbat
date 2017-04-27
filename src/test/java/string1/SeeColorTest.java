package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 27/04/2017.
 *
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 *
 * seeColor("redxx") → "red"
 * seeColor("xxred") → ""
 * seeColor("blueTimes") → "blue"
 */
public class SeeColorTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString(){
        assertEquals("", SeeColor.seeColor(""));
    }

    @Test
    public void whenStringPassedInHasLengthLessThan3ThenReturnEmptyString(){
        assertEquals("", SeeColor.seeColor("Hi"));
    }

    @Test
    public void whenStringIsPassedInContainsRedAtTheBeginningThenReturnRedAsStringValue(){
        assertEquals("red", SeeColor.seeColor("redxx"));
    }

    @Test
    public void whenStringIsPassedInContainsBlueAtBeginningThenReturnBlueAsStringValue(){
        assertEquals("blue", SeeColor.seeColor("blueTimes"));
    }

    @Test
    public void whenStringPassedInDoesNotContainRedOrBlueValueThenReturnEmptyString(){
        assertEquals("", SeeColor.seeColor("Artemas"));
    }

    @Test
    public void whenStringPassedInContainsRedAtTheEndThenReturnEmptyString(){
        assertEquals("", SeeColor.seeColor("xxred"));
    }

    @Test
    public void whenStringPassedInContainsBlueAtTheEndThenReturnEmptyString(){
        assertEquals("", SeeColor.seeColor("xblue"));
    }
}
