package functional1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 28/07/2017.
 *
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
 *
 * copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
 * copies3(["24", "a", ""]) → ["242424", "aaa", ""]
 * copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */
public class Copies3Test {

    List<String> actualStrings;
    List<String> expectedString;

    @Test
    public void whenAnEmptyStringInAListIsPassedThenReturnListAsIs(){

        actualStrings = new ArrayList<>();
        expectedString = new ArrayList<>();

        assertEquals(expectedString, Copies3.copies3(actualStrings));
    }

    @Test
    public void whenAStringInAListIsPassedThenReturnTheStringCopied3Times(){

        actualStrings = new ArrayList<>();
        actualStrings.add("a");

        expectedString = new ArrayList<>();
        expectedString.add("aaa");

        assertEquals(expectedString, Copies3.copies3(actualStrings));

    }

    @Test
    public void whenAListOfStringIsPassedThenReturnTheStringsCopied3Times(){

        actualStrings = new ArrayList<>();
        actualStrings.add("a");
        actualStrings.add("bb");
        actualStrings.add("ccc");

        expectedString = new ArrayList<>();
        expectedString.add("aaa");
        expectedString.add("bbbbbb");
        expectedString.add("ccccccccc");

        assertEquals(expectedString, Copies3.copies3(actualStrings));

    }

}
