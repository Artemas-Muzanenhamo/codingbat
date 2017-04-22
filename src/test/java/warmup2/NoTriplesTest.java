package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 20/04/2017.\
 *
 * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 *
 * noTriples([1, 1, 2, 2, 1]) → true
 * noTriples([1, 1, 2, 2, 2, 1]) → false
 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */
public class NoTriplesTest {

    @Test
    public void whenEmptyArrayIsPassedThenReturnTrue(){
        int[] arr = {};
        assertTrue(NoTriples.noTriples(arr));
    }

    @Test
    public void whenArrayLengthIsLessThan3ThenReturnTrue(){
        int[] arr = {1, 2};
        assertTrue(NoTriples.noTriples(arr));
    }

    @Test
    public void whenArrayContainsTripleValuesThatAreTheSameThenReturnFalse(){
        int[] arr = {3, 3, 3};
        assertFalse(NoTriples.noTriples(arr));
    }

    @Test
    public void whenArrayDoesNotHaveTripleValuesInARowThenReturnTrue(){
        int[] arr = {3, 4, 5, 6, 2, 1};
        assertTrue(NoTriples.noTriples(arr));
    }

    @Test
    public void whenArrayContainsTriple3InARowThenReturnFalse(){
        int[] arr = {1, 1, 1, 2, 2, 2, 1};
        assertFalse(NoTriples.noTriples(arr));
    }

    @Test
    public void whenArrayContainsNoTripleInARowThenReturnTrue(){
        int[] arr = {1, 1, 2, 2, 1};
        assertTrue(NoTriples.noTriples(arr));
    }

}
