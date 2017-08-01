package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 01/08/2017.
 *
 * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
 *
 * noLong(["this", "not", "too", "long"]) → ["not", "too"]
 * noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
 * noLong(["cccc", "cccc", "cccc"]) → []
 */
public class NoLongTest {

    private NoLong noLong;

    List<String> actualString;
    List<String> expectedString;

    @Before
    public void init(){
        noLong = new NoLong();
    }

    @Test
    public void whenAStringInAListPassedIsOfLength_4_ThenReturnAnEmptyList(){
        actualString = new ArrayList<>();
        actualString.add("Hello");

        expectedString = new ArrayList<>();

        assertEquals(expectedString, noLong.noLong(actualString));
    }

    @Test
    public void whenStringsInAListAreOfLength_4_Or_MoreThenReturnANewListMinusThoseStrings(){

        actualString = new ArrayList<>();
        actualString.add("a");
        actualString.add("bbb");
        actualString.add("cccc");

        expectedString = new ArrayList<>();
        expectedString.add("a");
        expectedString.add("bbb");

        assertEquals(expectedString, noLong.noLong(actualString));

    }


}
