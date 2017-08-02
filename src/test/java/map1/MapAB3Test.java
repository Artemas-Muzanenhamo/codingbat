package map1;

import org.junit.Before;
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
 * if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.
 *
 * mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
 * mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
 * mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}
 */
public class MapAB3Test {

    private MapAB3 mapAB3;

    @Before
    public void init(){
        mapAB3 = new MapAB3();
    }

    private Map<String, String> actualMap = new HashMap<>();
    private Map<String, String> expectedMap = new HashMap<>();

    @Test
    public void whenAnEmptyMapIsPassedThenReturnAnEmptyMap(){
        assertTrue(mapAB3.mapAB3(actualMap).isEmpty());
    }

    @Test
    public void whenMapPassedInHasKeyAOnlyThenReturnMapWithKeyBContainingTheValueOfKeyA(){

        actualMap.put("a", "aaa");

        expectedMap.put("a", "aaa");
        expectedMap.put("b", "aaa");

        assertEquals(expectedMap, mapAB3.mapAB3(actualMap));

    }

    @Test
    public void whenMapPassedInHasKeyBOnlyThenReturnMapWithKeyAContainingTheValueOfKeyB(){
        actualMap.put("b", "bbb");

        expectedMap.put("a", "bbb");
        expectedMap.put("b", "bbb");

        assertEquals(expectedMap, mapAB3.mapAB3(actualMap));

    }

}
