package map2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true
 * if that string appears 2 or more times in the array.
 */
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}

public class WordMultipleTest {

    private WordMultiple wordMultiple;

    @Before
    public void setup() {
        wordMultiple = new WordMultiple();
    }

    @Test
    public void should_return_false_when_array_of_strings_has_length_1() {
        String[] strings = {"a"};
        Map<String, Boolean> expectedResult = new HashMap<>();
        expectedResult.put("a", false);

        Map<String, Boolean> containsDuplicates = wordMultiple.wordMultiple(strings);

        assertEquals(expectedResult, containsDuplicates);
    }

    @Test
    public void should_not_do_anything_when_array_of_strings_has_length_0() {
        String[] strings = {};
        Map<String, Boolean> expectedResult = new HashMap<>();

        Map<String, Boolean> containsDuplicates = wordMultiple.wordMultiple(strings);

        assertEquals(expectedResult, containsDuplicates);
    }

    @Test
    public void should_return_true_when_there_is_a_duplicate_key() {
        String[] strings = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> expectedResult = new HashMap<>();
        expectedResult.put("a", true);
        expectedResult.put("b", true);
        expectedResult.put("c", false);

        Map<String, Boolean> containsDuplicates = wordMultiple.wordMultiple(strings);

        assertEquals(expectedResult, containsDuplicates);
    }

    @Test
    public void should_return_false_when_no_duplicate_keys_are_found() {
        String[] strings = {"c", "b", "a"};
        Map<String, Boolean> expectedResult = new HashMap<>();
        expectedResult.put("c", false);
        expectedResult.put("b", false);
        expectedResult.put("a", false);

        Map<String, Boolean> containsDuplicates = wordMultiple.wordMultiple(strings);

        assertEquals(expectedResult, containsDuplicates);
    }


}
