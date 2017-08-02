package map1;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 23/05/2017.
 *
 * Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
 * If both keys are present, append their 2 string values together and store the result under the key "ab".
 *
 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
 * mapAB({"a": "Hi"}) → {"a": "Hi"}
 * mapAB({"b": "There"}) → {"b": "There"}
 */
public class MapABTest {

    private MapAB mapAB;

    Map<String, String> actualMap = new HashMap<>();
    Map<String, String> expectedMap = new HashMap<>();

    @Before
    public void init(){
        mapAB = new MapAB();
    }

    @Test
    public void whenAnEmptyMapIsPassedThenReturnAnEmptyMap(){

        assertTrue(mapAB.mapAB(actualMap).isEmpty());

    }

    @Test
    public void whenMapWithKeyAIsPassedThenReturnMapAsIs(){

        actualMap.put("a", "hello");

        expectedMap.put("a", "hello");

        assertEquals(expectedMap, mapAB.mapAB(actualMap));

    }

    @Test
    public void whenMapWithKeyBIsPassedThenReturnMapAsIs(){

        actualMap.put("b", "world");

        expectedMap.put("b", "world");

        assertEquals(expectedMap, mapAB.mapAB(actualMap));

    }

    @Test
    public void whenMapWithBothKeysAPlusBThenReturnMapWithAKeyABPlusTheNewConcatenatedValue(){

        actualMap.put("a", "hello");
        actualMap.put("b", "world");

        expectedMap.put("a", "hello");
        expectedMap.put("b", "world");
        expectedMap.put("ab", "helloworld");

        assertEquals(expectedMap, mapAB.mapAB(actualMap));
    }

}
