package array1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 08/05/2017.
 *
 * Given an array of ints length 3, return the sum of all the elements.
 *
 * sum3([1, 2, 3]) → 6
 * sum3([5, 11, 2]) → 18
 * sum3([7, 0, 0]) → 7
 */
public class Sum3Test {

    int[] emptyArray = {};
    int[] arrayCase1 = {1, 2, 3};
    int[] arrayCase2 = {5, 11, 2};
    int[] arrayCase3 = {7, 0, 0};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnZero(){
        assertEquals(0, Sum3.sum3(emptyArray));
    }

    @Test
    public void whenArrayOfLength3IsPassedThenReturnTheSumOfAllElementValues(){
        assertEquals(6, Sum3.sum3(arrayCase1));

        //lazy
        assertEquals(18, Sum3.sum3(arrayCase2));
        assertEquals(7, Sum3.sum3(arrayCase3));
    }

}
