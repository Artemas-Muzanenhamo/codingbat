package map2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 30/05/2017.
 *
 * Given an array of non-empty strings, create and return a Map<String, String> as follows:
 *
 * for each string add its first character as a key with its last character as the value.
 *
 * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 * pairs(["man", "moon", "main"]) → {"m": "n"}
 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */
public class PairsTest {

    private String[] actualArray = {};
    private Map<String, String> expectedOutcome = new HashMap<>();

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyMap(){
        assertEquals(expectedOutcome, Pairs.pairs(actualArray));
    }

    @Test
    public void whenAnArrayContainingOneElementIsPassedThenReturnAMapWithTheKeyAndValue(){

        actualArray = new String[1];
        actualArray[0] = "a";

        expectedOutcome.put("a", "a");

        assertEquals(expectedOutcome, Pairs.pairs(actualArray));
    }

    @Test
    public void whenAnArrayContainingMoreElementsIsPassedThenReturnAMapWithMultipleKeysAndValues(){

        actualArray = new String[4];
        actualArray[0] = "man";
        actualArray[1] = "moon";
        actualArray[2] = "good";
        actualArray[3] = "night";

        expectedOutcome.put("g", "d");
        expectedOutcome.put("m", "n");
        expectedOutcome.put("n", "t");

        assertEquals(expectedOutcome, Pairs.pairs(actualArray));

    }

}
