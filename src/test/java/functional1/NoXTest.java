package functional1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 01/08/2017.
 *
 *
 Given a list of strings, return a list where each string has all its "x" removed.

 noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 noX(["x"]) → [""]
 */
public class NoXTest {

    List<String> actualString;
    List<String> expectedString;

    @Test
    public void whenAStringInAListContains_X_ThenReturnTheStringWithoutAn_X_(){

        actualString = new ArrayList<>();
        actualString.add("x");

        expectedString = new ArrayList<>();
        expectedString.add("");

        assertEquals(expectedString, NoX.noX(actualString));
    }

    @Test
    public void whenStringsInAListContain_X_ThenReturnStringsWithout_X_(){

        actualString = new ArrayList<>();
        actualString.add("xxax");
        actualString.add("xbxbx");
        actualString.add("xxcx");

        expectedString = new ArrayList<>();
        expectedString.add("a");
        expectedString.add("bb");
        expectedString.add("c");

        assertEquals(expectedString, NoX.noX(actualString));
    }
}
