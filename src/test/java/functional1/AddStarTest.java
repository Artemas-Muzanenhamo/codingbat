package functional1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 27/07/2017.
 *
 * Given a list of strings, return a list where each string has "*" added at its end.
 *
 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) → ["hello*", "there*"]
 * addStar(["*"]) → ["**"]
 *
 */
public class AddStarTest {

    List<String> expectedString;
    List<String> actualString;

    @Test
    public void whenAnEmptyListIsPassedThenReturnAStar(){

        actualString = new ArrayList<>();
        expectedString = new ArrayList<>();

        assertEquals(expectedString, AddStar.addStart(actualString));

    }

    @Test
    public void whenAListOfStringsIsPassedThenReturnStarsAppendedAtTheEnd(){

        actualString = new ArrayList<>();
        actualString.add("a");
        actualString.add("bb");
        actualString.add("ccc");

        expectedString = new ArrayList<>();
        expectedString.add("a*");
        expectedString.add("bb*");
        expectedString.add("ccc*");

        assertEquals(expectedString, AddStar.addStart(actualString));
    }

}
