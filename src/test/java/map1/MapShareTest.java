package map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 23/05/2017.
 *
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

 mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class MapShareTest {


    Map<String, String> actualMap = new HashMap<>();
    Map<String, String> expectedMap = new HashMap<>();

    @Test
    public void whenAnEmptyMapIsPassedThenReturnEmptyMap(){

        assertTrue(MapShare.mapShare(actualMap).isEmpty());

    }

    @Test
    public void whenKeyAIsPassedThenReturnKeyBWithTheValueOfKeyA(){

        actualMap.put("a", "aaa");
        actualMap.put("b", "bbb");

        expectedMap.put("a", "aaa");
        expectedMap.put("b", "aaa");

        assertEquals(expectedMap, MapShare.mapShare(actualMap));

    }

    @Test
    public void whenMapContainsKeyCThenRemoveKeyAndItsValueFromMap(){

        actualMap.put("a", "aaa");
        actualMap.put("b", "bbb");
        actualMap.put("c", "ccc");

        expectedMap.put("a", "aaa");
        expectedMap.put("b", "aaa");

        assertEquals(expectedMap, MapShare.mapShare(actualMap));
    }

}
