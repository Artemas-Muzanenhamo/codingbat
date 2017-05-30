package map2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 30/05/2017.
 *
 * The classic word-count algorithm:
 *
 * given an array of strings, return a Map<String, Integer> with a key for each different string,
 * with the value the number of times that string appears in the array.
 *
 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
 * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
public class WordCountTest {

    private String[] actualArray = {};
    private Map<String, Integer> expectedOutcome = new HashMap<>();

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyMap(){
        assertEquals(expectedOutcome, WordCount.wordCount(actualArray));
    }

    @Test
    public void whenAnArrayWithOneElementIsPassedThenReturnAMapWithTheWordCountAsTheValue(){

        actualArray = new String[1];
        actualArray[0] = "a";

        expectedOutcome.put("a", 1);

        assertEquals(expectedOutcome, WordCount.wordCount(actualArray));
    }

    @Test
    public void whenAnArrayWithManyElementsIsPassedThenReturnAMapWithTheWordCountsAsTheValue(){

        actualArray = new String[4];
        actualArray[0] = "c";
        actualArray[1] = "c";
        actualArray[2] = "c";
        actualArray[3] = "c";

        expectedOutcome.put("c", 4);

        assertEquals(expectedOutcome, WordCount.wordCount(actualArray));
    }

}
