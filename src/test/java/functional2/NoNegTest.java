package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 01/08/2017.
 *
 * Given a list of integers, return a list of the integers, omitting any that are less than 0.
 *
 * noNeg([1, -2]) → [1]
 * noNeg([-3, -3, 3, 3]) → [3, 3]
 * noNeg([-1, -1, -1]) → []
 */
public class NoNegTest {

    private NoNeg noNeg;

    List<Integer> actualNumber;
    List<Integer> expectedNumber;

    @Before
    public void setUp(){
        noNeg = new NoNeg();
    }

    @Test
    public void whenANumberInAListIsLessThan_0_ThenReturnTheListMinusThatNumber(){
        actualNumber = new ArrayList<>();
        actualNumber.add(-1);

        expectedNumber = new ArrayList<>();

        assertEquals(expectedNumber, noNeg.noNeg(actualNumber));
    }

    @Test
    public void whenMoreNumbersInAListAreLessThan_0_ThenReturnTheListMinusThoseNumbers(){

        actualNumber = new ArrayList<>();
        actualNumber.add(-3);
        actualNumber.add(-5);
        actualNumber.add(3);
        actualNumber.add(5);

        expectedNumber = new ArrayList<>();
        expectedNumber.add(3);
        expectedNumber.add(5);

        assertEquals(expectedNumber, noNeg.noNeg(actualNumber));

    }

}
