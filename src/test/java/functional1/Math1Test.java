package functional1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 28/07/2017.
 *
 * Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
 *
 * math1([1, 2, 3]) → [20, 30, 40]
 * math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
 * math1([10]) → [110]
 */
public class Math1Test {

    private Math1 math1;

    List<Integer> actualNum;
    List<Integer> expectedNum;

    @Before
    public void init(){
        math1 = new Math1();
    }

    @Test
    public void whenANumberInAListIsPassedThenReturnThenNumberAddedTo_1_And_MultipliedBy10(){

        actualNum = new ArrayList<>();
        actualNum.add(1);

        expectedNum = new ArrayList<>();
        expectedNum.add(20);

        assertEquals(expectedNum, math1.math(actualNum));

    }

    @Test
    public void whenAListIsPassedThenReturnThenNumbersAddedTo_1_And_MultipliedBy10(){

        actualNum = new ArrayList<>();
        actualNum.add(1);
        actualNum.add(2);
        actualNum.add(3);

        expectedNum = new ArrayList<>();
        expectedNum.add(20);
        expectedNum.add(30);
        expectedNum.add(40);

        assertEquals(expectedNum, math1.math(actualNum));

    }
}
