package map1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by amuzanenhamo on 24/05/2017.
 *
 * Given a map of food keys and topping values, modify and return the map as follows:
 *
 * if the key "potato" has a value, set that as the value for the key "fries".
 * If the key "salad" has a value, set that as the value for the key "spinach".
 *
 * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
 * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
 * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 *
 */
public class Topping3Test {

    private Map<String, String > actualMap = new HashMap<>();
    private Map<String, String> expectedMap = new HashMap<>();

    @Test
    public void whenAnEmptyMapIsPassedThenReturnAnEmptyMap(){

        assertTrue(Topping3.topping3(actualMap).isEmpty());

    }

    @Test
    public void whenAMapWithKeyPotatoIsPassedInThenReturnMapWithKeyFriesAndValueOfPotato(){

        actualMap.put("potato", "ketchup");

        expectedMap.put("potato", "ketchup");
        expectedMap.put("fries", "ketchup");

        assertEquals(expectedMap, Topping3.topping3(actualMap));

    }

    @Test
    public void whenAMapWithKeySaladIsPassedThenReturnAMapWithKeySpinachAndValueOfSalad(){
        actualMap.put("salad", "oil");

        expectedMap.put("salad", "oil");
        expectedMap.put("spinach", "oil");

        assertEquals(expectedMap, Topping3.topping3(actualMap));

    }


}
