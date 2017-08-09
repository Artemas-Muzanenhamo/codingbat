package map2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 16/06/2017.
 *
 * Loop over the given array of strings to build a result string like this:
 *
 * when a string appears the 2nd, 4th, 6th, etc. time in the array
 * - append the string to the result.
 *
 * Return the empty string if no string appears a 2nd time.
 *
 * wordAppend(["a", "b", "a"]) → "a"
 * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
 * wordAppend(["a", "", "a"]) → "a"
 */
public class WordAppendTest {

    private WordAppend wordAppend;

    private String[] array = {};
    private String expected = "";

    @Before
    public void init(){
        wordAppend = new WordAppend();
    }

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyString(){
        assertEquals(expected, wordAppend.wordAppend(array));
    }

    @Test
    public void whenAnArrayContainsWordsThatOccurTwiceThenReturnTheLetterAsAString(){

        array = new String[]{"a", "b", "a"};
        expected = "a";

        assertEquals(expected, wordAppend.wordAppend(array));

    }

    @Test
    public void whenAnArrayContainsWordsThatOccurTwiceAndIsLengthMoreThan2ThenReturnTheLetterAsAString(){

        array = new String[]{"a", "b", "a", "b", "a"};
        expected = "ab";

        assertEquals(expected, wordAppend.wordAppend(array));

    }
}
