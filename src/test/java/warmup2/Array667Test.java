package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 17/04/2017.
 *
 * Given an array of ints, return the number of times that two 6's are next to each other in the array.
 * Also count instances where the second "6" is actually a 7.
 *
 * array667([6, 6, 2]) → 1
 * array667([6, 6, 2, 6]) → 1
 * array667([6, 7, 2, 6]) → 1
 */
public class Array667Test {

    @Test
    public void whenEmptyNumberIsPassedInThenReturn0(){
        int[] arr = {};
        assertEquals(0, Array667.array667(arr));
    }

    @Test
    public void whenArrayDoesNotContainNumber6ThenReturnZero(){
        int[] arr = {1, 2, 3, 4};
        assertEquals(0, Array667.array667(arr));
    }

    @Test
    public void whenArrayContainsNumber6ThenReturnZero(){
        int[] arr = {1, 4, 5, 6};
        assertEquals(0, Array667.array667(arr));
    }

    @Test
    public void whenArrayContainsNumbers66ThenReturnOneAsCount(){
        int[] arr = {6, 6, 2, 6};
        int[] arr2 = {6, 7, 2, 6};

        assertEquals(1, Array667.array667(arr));
        assertEquals(1, Array667.array667(arr2));
    }

    @Test
    public void whenArrayContainsNumbers667ThenReturn2AsCount(){
        int[] arr = {1, 6, 6, 7, 2, 3};
        assertEquals(2, Array667.array667(arr));
    }

}
