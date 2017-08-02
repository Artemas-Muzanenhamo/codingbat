package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Artemas on 02/08/2017.
 *
 * Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
 *
 * two2([1, 2, 3]) → [4, 6]
 * two2([2, 6, 11]) → [4]
 * two2([0]) → [0]
 */
public class Two2Test {

    private Two2 two2;

    List<Integer> actualNumbers;
    List<Integer> expectedNumbers;

    @Before
    public void init(){
        two2 = new Two2();

        actualNumbers = new ArrayList<>();
        expectedNumbers = new ArrayList<>();
    }

    @Test
    public void whenANumberInAListResultsIn_2_OrHasARightMostDigitOf_2_ThenOmitItFromTheList(){

        actualNumbers.add(1);
        actualNumbers.add(2);

        expectedNumbers.add(4);

        assertEquals(expectedNumbers, two2.two2(actualNumbers));

    }

}
