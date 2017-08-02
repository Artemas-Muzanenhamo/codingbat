package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Artemas on 02/08/2017.
 *
 * Given a list of integers,
 * return a list of those numbers squared and the product added to 10,
 * omitting any of the resulting numbers that end in 5 or 6.
 *
 * square56([3, 1, 4]) → [19, 11]
 * square56([1]) → [11]
 * square56([2]) → [14]
 */
public class Square56Test {

    private Square56 square56;

    List<Integer> actualNumbers;
    List<Integer> expectedNumbers;

    @Before
    public void init(){
        square56 = new Square56();

        actualNumbers = new ArrayList<>();
        expectedNumbers = new ArrayList<>();
    }

    @Test
    public void whenANumberInAListResultsIn5_Or_6ThenOmitItFromTheList(){
        actualNumbers.add(3);
        actualNumbers.add(1);
        actualNumbers.add(4);
        actualNumbers.add(5);

        expectedNumbers.add(19);
        expectedNumbers.add(11);

        assertEquals(expectedNumbers, square56.square56(actualNumbers));
    }
}
