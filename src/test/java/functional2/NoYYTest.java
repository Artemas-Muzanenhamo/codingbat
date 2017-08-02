package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 02/08/2017.
 *
 * Given a list of strings,
 * return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
 *
 * noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
 * noYY(["a", "b", "cy"]) → ["ay", "by"]
 * noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
 */
public class NoYYTest {

    private NoYY noYY;

    List<String> actualStrings;
    List<String> expectedStrings;

    @Before
    public void init(){
        noYY = new NoYY();
        actualStrings = new ArrayList<>();
        expectedStrings = new ArrayList<>();
    }

    @Test
    public void whenAStringInAListIsPassedThenAppend_Y_AtTheEndOfTheString(){
        actualStrings.add("aa");
        expectedStrings.add("aay");

        assertEquals(expectedStrings, noYY.noYY(actualStrings));
    }

    @Test
    public void whenAListOfStringsArePassedThenReturnAllStringsAppendedWith_Y_(){
        actualStrings.add("aa");
        actualStrings.add("bb");
        actualStrings.add("cc");

        expectedStrings.add("aay");
        expectedStrings.add("bby");
        expectedStrings.add("ccy");

        assertEquals(expectedStrings, noYY.noYY(actualStrings));
    }

    @Test
    public void whenAStringInTheListPassedResultsIn_YY_ThenOmitItFromTheList(){
        actualStrings.add("aa");
        actualStrings.add("ay");

        expectedStrings.add("aay");

        assertEquals(expectedStrings, noYY.noYY(actualStrings));

    }
}
