package array2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by artemasm on 07/08/2017.
 *
 * Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
 *
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 */
public class CountEventsTest {

    private CountEvents countEvents;

    int[] actualArray;

    @Before
    public void init(){
        countEvents = new CountEvents();
    }

    @Test
    public void whenAnArrayHas3EvenNumbersPassedThenReturnTheCount_3_OfEvenInts(){
        actualArray = new int[]{2, 1, 2, 3, 4};

        assertEquals(3, countEvents.countEvents(actualArray));
    }

}
