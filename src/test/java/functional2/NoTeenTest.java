package functional2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 01/08/2017.
 *
 * Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
 *
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 */
public class NoTeenTest {

    private NoTeen noTeen;

    List<Integer> actualNumbers;
    List<Integer> expectedNumbers;

    @Before
    public void init(){
        noTeen = new NoTeen();
    }

    @Test
    public void whenANumberInTheListIsBetween_13_And_19_ThenReturnAnEmptyList(){
        actualNumbers = new ArrayList<>();
        actualNumbers.add(13);

        expectedNumbers = new ArrayList<>();

        assertEquals(expectedNumbers, noTeen.noTeen(actualNumbers));
    }

    @Test
    public void whenSomeNumbersInAListAreBetween_13_And_19_ThenReturnAListMinusThoseNumbers(){

        actualNumbers = new ArrayList<>();
        actualNumbers.add(12);
        actualNumbers.add(13);
        actualNumbers.add(19);
        actualNumbers.add(20);

        expectedNumbers = new ArrayList<>();
        expectedNumbers.add(12);
        expectedNumbers.add(20);

        assertEquals(expectedNumbers, noTeen.noTeen(actualNumbers));
    }
}
