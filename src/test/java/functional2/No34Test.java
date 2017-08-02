package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 02/08/2017.
 *
 * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
 *
 * no34(["a", "bb", "ccc"]) → ["a", "bb"]
 * no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
 * no34(["ccc", "dddd", "apple"]) → ["apple"]
 *
 */
public class No34Test {

    private No34 no34;

    List<String> actualStrings;
    List<String> expectedStrings;

    @Before
    public void init(){
        no34 = new No34();
    }

    @Test
    public void whenAStringInAListIsLength3ThenReturnAnEmptyList(){

        actualStrings = new ArrayList<>();
        actualStrings.add("ccc");

        expectedStrings = new ArrayList<>();

        assertEquals(expectedStrings, no34.no34(actualStrings));
    }

    @Test
    public void whenAStringInAListIsLength4ThenReturnAnEmptyList(){

        actualStrings = new ArrayList<>();
        actualStrings.add("abcd");

        expectedStrings = new ArrayList<>();

        assertEquals(expectedStrings, no34.no34(actualStrings));

    }

    @Test
    public void whenStringsInAListAreOfLength_3_Or_4_ThenRemoveThoseStringsFromTheList(){

        actualStrings = new ArrayList<>();
        actualStrings.add("a");
        actualStrings.add("bb");
        actualStrings.add("ccc");
        actualStrings.add("dddd");
        actualStrings.add("eeeee");

        expectedStrings = new ArrayList<>();
        expectedStrings.add("a");
        expectedStrings.add("bb");
        expectedStrings.add("eeeee");

        assertEquals(expectedStrings, no34.no34(actualStrings));

    }

}
