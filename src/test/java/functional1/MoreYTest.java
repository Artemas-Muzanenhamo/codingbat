package functional1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 28/07/2017.
 *
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 *
 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 * moreY(["yay"]) → ["yyayy"]
 */
public class MoreYTest {

    List<String> expectedStrings;
    List<String> actualStrings;

    @Test
    public void whenAnEmptyListIsPassedThenReturn_YY(){

        actualStrings = new ArrayList<>();
        expectedStrings = new ArrayList<>();

        assertEquals(expectedStrings, MoreY.moreY(actualStrings));
    }

    @Test
    public void whenAStringInAListIsPassedThenReturn_YY_AtTheStartAndEnd(){

        actualStrings = new ArrayList<>();
        actualStrings.add("artemas");

        expectedStrings = new ArrayList<>();
        expectedStrings.add("yartemasy");

        assertEquals(expectedStrings, MoreY.moreY(actualStrings));

    }

}
