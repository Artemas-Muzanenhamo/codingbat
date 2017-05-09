package array1;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by amuzanenhamo on 09/05/2017.
 *
 * Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
 * The original array will be length 1 or more.
 *
 * makeEnds([1, 2, 3]) → [1, 3]
 * makeEnds([1, 2, 3, 4]) → [1, 4]
 * makeEnds([7, 4, 6, 2]) → [7, 2]
 */
public class MakeEndsTest {

    int[] emptyArray = {};
    int[] arrayCase1 = {1};
    int[] arrayCase2 = {6, 3};
    int[] arrayCase3 = {1, 2, 4, 5, 2};

    int[] expectedCase1 = {1, 1};
    int[] expectedCase2 = {6, 3};
    int[] expectedCase3 = {1, 2};

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyArrayValue(){
        assertArrayEquals(emptyArray, MakeEnds.makeEnds(emptyArray));
    }

    @Test
    public void whenArrayPassedInIsLength1ThenReturnTheArrayValueAsIs(){
        assertArrayEquals(expectedCase1, MakeEnds.makeEnds(arrayCase1));
    }

    @Test
    public void whenArrayPassedInHasLengthMoreThan1ThenReturnArrayMadeOfThe1stElementAndLastElement(){
        assertArrayEquals(expectedCase2, MakeEnds.makeEnds(arrayCase2));

        //lazy
        assertArrayEquals(expectedCase3, MakeEnds.makeEnds(arrayCase3));
    }

}
