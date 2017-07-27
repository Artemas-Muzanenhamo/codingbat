package functional1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/07/2017.
 *
 * Given a list of integers, return a list where each integer is multiplied by 2.
 *
 * doubling([1, 2, 3]) → [2, 4, 6]
 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 * doubling([]) → []
 *
 */
public class DoublingTest {

    List<Integer> actualNumbers;
    List<Integer> expectedNumbers;

    @Test
    public void whenANumberIsPassedThenReturnTheNumberMultiplied(){

        actualNumbers = new ArrayList<>();
        actualNumbers.add(5);

        expectedNumbers = new ArrayList<>();
        expectedNumbers.add(10);

        assertEquals(expectedNumbers, Doubling.doubling(actualNumbers));
    }

    @Test
    public void whenAnEmptyListIsPassedThenReturnTheListAsIs(){

        actualNumbers = new ArrayList<>();
        actualNumbers.add(0);

        expectedNumbers = new ArrayList<>();
        expectedNumbers.add(0);

        assertEquals(expectedNumbers, Doubling.doubling(actualNumbers));
    }

    @Test
    public void whenAListContaining_1_2_3_ThenReturn_2_4_6(){

        actualNumbers = new ArrayList<>();
        actualNumbers.add(1);
        actualNumbers.add(2);
        actualNumbers.add(3);

        expectedNumbers = new ArrayList<>();
        expectedNumbers.add(2);
        expectedNumbers.add(4);
        expectedNumbers.add(6);

        assertEquals(expectedNumbers, Doubling.doubling(actualNumbers));

    }
}
