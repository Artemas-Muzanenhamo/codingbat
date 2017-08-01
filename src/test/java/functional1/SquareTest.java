package functional1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/07/2017.
 *
 * Given a list of integers, return a list where each integer is multiplied with itself.
 *
 * square([1, 2, 3]) → [1, 4, 9]
 * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
 * square([]) → []
 */
public class SquareTest {

    private Square square;

    List<Integer> expectedNum;
    List<Integer> actualNum;

    @Before
    public void init(){
        square = new Square();
    }

    @Test
    public void whenAnEmptyListIsPassedThenReturnTheListAsIs(){
        actualNum = new ArrayList<>();
        expectedNum = new ArrayList<>();

        assertEquals(expectedNum, square.square(actualNum));
    }

    @Test
    public void whenANumberInTheListIsPassedThenReturnTheNumberSquared(){

        actualNum = new ArrayList<>();
        actualNum.add(2);

        expectedNum = new ArrayList<>();
        expectedNum.add(4);

        assertEquals(expectedNum, square.square(actualNum));
    }

    @Test
    public void whenAListIsPassedThenReturnTheNumbersSquared(){

        actualNum = new ArrayList<>();
        actualNum.add(1);
        actualNum.add(2);
        actualNum.add(3);

        expectedNum = new ArrayList<>();
        expectedNum.add(1);
        expectedNum.add(4);
        expectedNum.add(9);

        assertEquals(expectedNum, square.square(actualNum));
    }

}
