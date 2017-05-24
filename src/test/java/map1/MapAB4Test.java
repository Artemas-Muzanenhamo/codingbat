package map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 24/05/2017.
 *
 * Modify and return the given map as follows:
 *
 * if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value.
 * If the values exist and have the same length, change them both to the empty string in the map.
 *
 * mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
 * mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 * mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */
public class MapAB4Test {

    private Map<String, String> actualMap = new HashMap<>();
    private Map<String, String> expectedMap = new HashMap<>();

    @Test
    public void whenAnEmptyMapIsPassedThenReturnAnEmptyMap(){

        assertTrue(MapAB4.mapAB4(actualMap).isEmpty());

    }

    @Test
    public void whenKeyAHasAValueWithLongerLengthThanTheValueOfKeyBThenReturnMapWithKeyCAndWithValueOfKeyA(){

        actualMap.put("a", "aaa");
        actualMap.put("b", "bb");

        expectedMap.put("a", actualMap.get("a"));
        expectedMap.put("b", actualMap.get("b"));
        expectedMap.put("c", actualMap.get("a"));

        assertEquals(expectedMap, MapAB4.mapAB4(actualMap));

    }

    @Test
    public void whenKeyBHasAValueWithLongerLengthThanTheValueOfKeyAThenReturnMapWithKeyCAndWithValueOfKeyB(){

        actualMap.put("a", "aa");
        actualMap.put("b", "bbb");

        expectedMap.put("a", actualMap.get("a"));
        expectedMap.put("b", actualMap.get("b"));
        expectedMap.put("c", actualMap.get("b"));

        assertEquals(expectedMap, MapAB4.mapAB4(actualMap));

    }

    @Test
    public void whenBothKeyAAndKeyBHaveValuesOfTheSameLengthThenReturnEmptyMap(){

        actualMap.put("a", "aaa");
        actualMap.put("b", "bbb");

        expectedMap.put("a", "");
        expectedMap.put("b", "");

        assertEquals(expectedMap, MapAB4.mapAB4(actualMap));

    }

    @Test
    public void whenKeyAIsPassedOnlyThenReturnMapAsIs(){

        actualMap.put("a", "aaa");

        expectedMap.put("a", "aaa");

        assertEquals(expectedMap, MapAB4.mapAB4(actualMap));
    }

}
