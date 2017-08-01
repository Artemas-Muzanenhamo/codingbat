package functional1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 01/08/2017.
 *
 * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
 *
 * rightDigit([1, 22, 93]) → [1, 2, 3]
 * rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
 * rightDigit([10, 0]) → [0, 0]
 *
 */
public class RightDigitTest {

    private RightDigit rightDigit;

    List<Integer> actualNumber;
    List<Integer> expectedNumber;

    @Before
    public void init(){
        rightDigit = new RightDigit();
    }

    @Test
    public void whenANumberInAListIsPassedThenReturnTheRightMostDigit(){

        actualNumber = new ArrayList<>();
        actualNumber.add(12);

        expectedNumber = new ArrayList<>();
        expectedNumber.add(2);

        assertEquals(expectedNumber, rightDigit.rightDigit(actualNumber));

    }

    @Test
    public void whenNumbersInAListArePassedInThenReturnTheRightMostDigits(){

        actualNumber = new ArrayList<>();
        actualNumber.add(16);
        actualNumber.add(8);
        actualNumber.add(886);
        actualNumber.add(10);
        actualNumber.add(1);

        expectedNumber = new ArrayList<>();
        expectedNumber.add(6);
        expectedNumber.add(8);
        expectedNumber.add(6);
        expectedNumber.add(0);
        expectedNumber.add(1);

        assertEquals(expectedNumber, rightDigit.rightDigit(actualNumber));

    }

}
