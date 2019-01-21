package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 27/04/2017.
 * <p>
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 * <p>
 * seeColor("redxx") → "red"
 * seeColor("xxred") → ""
 * seeColor("blueTimes") → "blue"
 */
public class SeeColorTest {

    private SeeColor seeColor;

    @Before
    public void setup() {
        seeColor = new SeeColor();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnEmptyString() {
        assertEquals("", seeColor.seeColor(""));
    }

    @Test
    public void whenStringPassedInHasLengthLessThan3ThenReturnEmptyString() {
        assertEquals("", seeColor.seeColor("Hi"));
    }

    @Test
    public void whenStringIsPassedInContainsRedAtTheBeginningThenReturnRedAsStringValue() {
        assertEquals("red", seeColor.seeColor("redxx"));
    }

    @Test
    public void whenStringIsPassedInContainsBlueAtBeginningThenReturnBlueAsStringValue() {
        assertEquals("blue", seeColor.seeColor("blueTimes"));
    }

    @Test
    public void whenStringPassedInDoesNotContainRedOrBlueValueThenReturnEmptyString() {
        assertEquals("", seeColor.seeColor("Artemas"));
    }

    @Test
    public void whenStringPassedInContainsRedAtTheEndThenReturnEmptyString() {
        assertEquals("", seeColor.seeColor("xxred"));
    }

    @Test
    public void whenStringPassedInContainsBlueAtTheEndThenReturnEmptyString() {
        assertEquals("", seeColor.seeColor("xblue"));
    }
}
