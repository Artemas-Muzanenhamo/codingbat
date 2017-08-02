package map1;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 22/05/2017.
 * Contributed by Hemanthi (c)
 *
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
 * Basically "b" is a bully, taking the value and replacing it with the empty string
 *
 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 * mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */
public class MapBullyTest {
    
    private MapBully mapBully;

    private Map<String, String> map =  new HashMap<>();
    private Map<String, String> map1 =  new HashMap<>();

    @Before
    public void init(){
        mapBully = new MapBully();
    }
    
    @Test
    public void whenAnEmptyMapIsPassedThenReturnEmptyMap(){

        assertTrue(mapBully.mapBully(map).isEmpty());


    }

    @Test
    public void whenKeyAIsPassedWithNoValueThenReturnMapAsIs(){

        map.put("a", "");

        assertEquals(map, mapBully.mapBully(map));

    }

    @Test
    public void whenKeyAWithValueIsPassedThenReturnBWithValueOfA(){

        map.put("a", "candy");

        map1.put("a", "");
        map1.put("b", "candy");

        assertEquals(map1, mapBully.mapBully(map));

    }

    @Test
    public void artyTest3(){

//        Map<String, String> map  = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");

//        Map<String, String> map1  = new HashMap<>();
        map1.put("a", "");
        map1.put("b", "candy");

        assertEquals(map1, mapBully.mapBully(map));

    }

    @Test
    public void artyTest4(){

        map.put("a", "candy");
        map.put("b", "carrot");
        map.put("c", "meh");

        map1.put("a", "");
        map1.put("b", "candy");
        map1.put("c", "meh");

        assertEquals(map1, mapBully.mapBully(map));

    }

    @Test
    public void artyTest5(){
        map.put("b", "carrot");

        map1.put("b", "carrot");

        assertEquals(map1, mapBully.mapBully(map));

    }
}
