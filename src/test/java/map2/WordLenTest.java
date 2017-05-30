package map2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 30/05/2017.
 *
 *
 * Given an array of strings,
 *
 * return a Map<String, Integer> containing a key for every different string in the array,
 * and the value is that string's length.
 *
 * wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
 * wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
 * wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
 */
public class WordLenTest {

    private String[] actualArray = {};
    private Map<String, Integer> expectedOutcome = new HashMap<>();

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyMap(){
        assertEquals(expectedOutcome, WordLen.wordLen(actualArray));
    }

    @Test
    public void whenOneArrayElementIsPassedThenReturnAMapWithAKeyAndAValueOfTheKeyLength(){

        actualArray = new String[1];
        actualArray[0] = "a";

        expectedOutcome.put("a", 1);

        assertEquals(expectedOutcome, WordLen.wordLen(actualArray));
    }
}
