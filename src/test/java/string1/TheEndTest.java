package string1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 24/04/2017.
 *
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
 * The string will be non-empty.
 *
 * theEnd("Hello", true) → "H"
 * theEnd("Hello", false) → "o"
 * theEnd("oh", true) → "o"
 */
public class TheEndTest {
    
    private TheEnd theEnd;
    
    @Before
    public void init(){
        theEnd = new TheEnd();
    }

    @Test
    public void whenStringIsEmptyThenReturnEmptyValue(){
        assertEquals("", theEnd.theEnd("", true));
    }

    @Test
    public void whenStringPassedHasLength1AndFrontIsSetToTrueThenReturnValue(){
        assertEquals("o", theEnd.theEnd("o", true));
    }

    @Test
    public void whenStringPassedHasLength1AndFrontIsSetToFalseThenReturnValue(){
        assertEquals("o", theEnd.theEnd("o", false));
    }

    @Test
    public void whenStringPassedHasLengthMoreThan1ThenReturnFrontCharacterIfFrontIsSetToTrue(){
        assertEquals("H", theEnd.theEnd("Hello", true));

        //lazy
        assertEquals("O", theEnd.theEnd("Oh", true));
    }

    @Test
    public void whenStringPassedHasLengthMoreThan1ThenReturnLastCharacterIfFrontIsSetToFalse(){
        assertEquals("o", theEnd.theEnd("Hello", false));

        //lazy
        assertEquals("h", theEnd.theEnd("Oh", false));
    }
}
