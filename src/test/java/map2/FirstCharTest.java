package map2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 31/05/2017.
 *
 * Given an array of non-empty strings,
 *
 * return a Map<String, String> with a key for every different first character seen,
 * with the value of all the strings starting with that character appended together in the order they appear in the array.
 *
 * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
 * firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
 * firstChar([]) → {}
 */
public class FirstCharTest {

    private FirstChar firstChar;

    private String[] actualArray = {};
    private Map<String, String> expectedOutcome = new HashMap<>();

    @Before
    public void init(){
        firstChar = new FirstChar();
    }

    @Test
    public void whenAnEmptyArrayIsPassedThenReturnAnEmptyMap(){
        assertEquals(expectedOutcome, firstChar.firstChar(actualArray));
    }

    @Test
    public void whenAnArrayWithOneElementIsPassedThenReturnAMapWithKeyAndValueMadeFromTheWordInTheArray(){

        actualArray = new String[1];
        actualArray[0] = "salt";

        expectedOutcome.put("s", "salt");

        assertEquals(expectedOutcome, firstChar.firstChar(actualArray));
    }

    @Test
    public void whenAnArrayOfTwoElementsIsPassedThenReturnMapWithTwoKeysAndValuesMadeUpFromTheWordsInTheArray(){

        actualArray = new String[2];
        actualArray[0] = "salt";
        actualArray[1] = "soda";

        expectedOutcome.put("s", "saltsoda");

        assertEquals(expectedOutcome, firstChar.firstChar(actualArray));
    }

}
