package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 02/08/2017.
 *
 * Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
 *
 * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
 * noZ(["hziz", "hzello", "hi"]) → ["hi"]
 * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */
public class NoZTest {

    private NoZ noZ;

    List<String> actualString;
    List<String> expectedString;

    @Before
    public void init(){
        noZ = new NoZ();
    }

    @Test
    public void whenAStringInAListContains_Z_ThenReturnAnEmptyList(){
        actualString = new ArrayList<>();
        actualString.add("aza");

        expectedString = new ArrayList<>();

        assertEquals(expectedString, noZ.noZ(actualString));
    }

    @Test
    public void whenAListOfStringPassedContains_Z_ThenReturnAListMinusThoseStrings(){
        actualString = new ArrayList<>();
        actualString.add("aaa");
        actualString.add("bbb");
        actualString.add("aza");

        expectedString = new ArrayList<>();
        expectedString.add("aaa");
        expectedString.add("bbb");

        assertEquals(expectedString, noZ.noZ(actualString));
    }
}
