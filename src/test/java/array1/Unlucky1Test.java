package array1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 16/06/2017.
 *
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 *
 * Return true if
 * - the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
 *
 * unlucky1([1, 3, 4, 5]) → true
 * unlucky1([2, 1, 3, 4, 5]) → true
 * unlucky1([1, 1, 1]) → false
 */
public class Unlucky1Test {

    private int[] nums = {};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnFalse(){
        assertFalse(Unlucky1.unlucky1(nums));
    }

    @Test
    public void whenAnArrayOfLength1IsPassedThenReturnFalse(){

        nums = new int[]{1};

        assertFalse(Unlucky1.unlucky1(nums));
    }

    @Test
    public void whenAnArrayOfLength2IsPassedThenReturnTrueIf1IsFollowedBy3(){

        nums = new int[]{1, 3};

        assertTrue(Unlucky1.unlucky1(nums));
    }

    @Test
    public void whenAnArrayOfLength2IsPassedThenReturnFalseIf1IsNotFollowedBy3(){

        nums = new int[]{1, 2};

        assertFalse(Unlucky1.unlucky1(nums));
    }

    @Test
    public void whenAnArrayOfLength3OrMoreIsPassedThenReturnTrueIf1IsFollowedBy3FromTheFirst2Positions(){

        nums = new int[]{2, 1, 3};

        assertTrue(Unlucky1.unlucky1(nums));

    }

    @Test
    public void whenAnArrayContains1FollowedBy3AtTheLastPositionsInTheArrayThenReturnTrue(){

        nums = new int[]{1, 2, 3, 4, 1, 3};

        assertTrue(Unlucky1.unlucky1(nums));
    }
}
