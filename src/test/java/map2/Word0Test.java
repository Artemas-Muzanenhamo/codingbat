package map2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 30/05/2017.
 *
 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
 * always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
 * but for this problem the value is simply 0.
 *
 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
 * word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
 * word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
 */
public class Word0Test {
    
    private Word0 word0;

    private String[] actualArray = {};
    private Map<String, Integer> expectedOutcome = new HashMap<>();
    
    @Before
    public void init(){
        word0 = new Word0();
    }

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyMap(){
        assertEquals(expectedOutcome, word0.word0(actualArray));
    }

    @Test
    public void whenAnArrayContainingOneElementIsPassedThenReturnAMapWithOneKeyAndValue(){

        actualArray = new String[1];
        actualArray[0] = "a";

        expectedOutcome.put("a", 0);

        assertEquals(expectedOutcome, word0.word0(actualArray));
    }

    @Test
    public void whenArrayContainingMultipleElementsIsPassedThenReturnAMapWithManyElementsAndValues(){

        actualArray = new String[5];
        actualArray[0] = "a";
        actualArray[1] = "b";
        actualArray[2] = "c";
        actualArray[3] = "a";
        actualArray[4] = "b";

        expectedOutcome.put("a", 0);
        expectedOutcome.put("b", 0);
        expectedOutcome.put("c", 0);

        assertEquals(expectedOutcome, word0.word0(actualArray));

    }

}
