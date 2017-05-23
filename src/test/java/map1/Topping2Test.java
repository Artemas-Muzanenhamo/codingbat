package map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 23/05/2017.
 *
 * Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also.
 * If the key "spinach" has a value, change that value to "nuts".
 *
 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
 * topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
 * topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
 */
public class Topping2Test {

    Map<String, String> actualMap = new HashMap<>();
    Map<String, String> expectedMap = new HashMap<>();

    @Test
    public void whenAnEmptyMapIsPassedThenReturnAnEmptyMap(){
        assertTrue(Topping2.topping2(actualMap).isEmpty());
    }

    @Test
    public void whenMapContainsKeyIceCreamThenReturnMapWithKeyYogurtWithValueOfTheKeyIceCream(){

        actualMap.put("ice cream", "cherry");

        expectedMap.put("ice cream", "cherry");
        expectedMap.put("yogurt", "cherry");

        assertEquals(expectedMap, Topping2.topping2(actualMap));

    }


    @Test
    public void whenMapContainsKeySpinachThenReturnMapWithKeySpinachAndNewValueNuts(){

        actualMap.put("spinach", "cherry");

        expectedMap.put("spinach", "nuts");

        assertEquals(expectedMap, Topping2.topping2(actualMap));

    }


}
