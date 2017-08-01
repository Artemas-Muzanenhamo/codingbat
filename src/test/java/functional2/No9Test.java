package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 01/08/2017.
 *
 * Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
 *
 * no9([1, 2, 19]) → [1, 2]
 * no9([9, 19, 29, 3]) → [3]
 * no9([1, 2, 3]) → [1, 2, 3]
 */
public class No9Test {

    private No9 no9;

    @Before
    public void setUp(){
        no9 = new No9();
    }

    List<Integer> actualNumbers;
    List<Integer> expectedNumbers;

    @Test
    public void whenANumberInTheListHas_9_AsTheRightMostDigitThenReturnAnEmptyList(){
        actualNumbers = new ArrayList<>();
        actualNumbers.add(19);

        expectedNumbers = new ArrayList<>();

        assertEquals(expectedNumbers, no9.no9(actualNumbers));
    }

    @Test
    public void whenNumbersInAListHave_9_AsTheRightMostDigitThenReturnANewListWithoutThoseNumbers(){

        actualNumbers = new ArrayList<>();
        actualNumbers.add(9);
        actualNumbers.add(29);
        actualNumbers.add(19);
        actualNumbers.add(3);

        expectedNumbers = new ArrayList<>();
        expectedNumbers.add(3);

        assertEquals(expectedNumbers, no9.no9(actualNumbers));

    }
}
