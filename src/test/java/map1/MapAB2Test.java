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
 * Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
 *
 * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
 * mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
 * mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
 *
 */
public class MapAB2Test {
    
    private MapAB2 mapAB2;
    
    @Before
    public void init(){
        mapAB2 = new MapAB2();
    }

    private Map<String, String> actualMap = new HashMap<>();
    private Map<String, String> expectedMap = new HashMap<>();

    @Test
    public void whenAnEmptyMapIsPassedThenReturnAnEmptyMap(){
        assertTrue(mapAB2.mapAB2(actualMap).isEmpty());
    }

    @Test
    public void whenMapHasKeyAAndKeyBWithBothTheSameValueThenReturnAnEmptyMap(){

        actualMap.put("a", "aaa");
        actualMap.put("b", "aaa");

        assertEquals(expectedMap, mapAB2.mapAB2(actualMap));

    }

    @Test
    public void whenAMapHasKeyAAndKeyBWithDifferentValuesThenReturnTheMapAsIs(){
        actualMap.put("a", "aaa");
        actualMap.put("b", "bbb");
        actualMap.put("c", "aaa");

        expectedMap.put("a", "aaa");
        expectedMap.put("b", "bbb");
        expectedMap.put("c", "aaa");

        assertEquals(expectedMap, mapAB2.mapAB2(actualMap));

    }

}
