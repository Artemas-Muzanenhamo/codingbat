package map1;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 23/05/2017.
 *
 * Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry".
 * In all cases, set the key "bread" to have the value "butter".
 *
 * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
 * topping1({}) → {"bread": "butter"}
 * topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
 */
public class Topping1Test {

    private Topping1 topping1;

    Map<String, String> actualMap = new HashMap<>();
    Map<String, String> expectedMap = new HashMap<>();

    @Before
    public void init(){
        topping1 = new Topping1();
    }

    @Test
    public void whenAnEmptyMapIsPassedThenReturnMapWithKeyBreadAndValueButter(){
        expectedMap.put("bread", "butter");

        assertEquals(expectedMap, topping1.topping1(actualMap));
    }

    @Test
    public void whenMapPassedContainsKeyIceCreamThenReturnMapWithNewKeyValueCherryAndKeyBreadAndValueButter(){

        actualMap.put("ice cream", "peanuts");

        expectedMap.put("ice cream", "cherry");
        expectedMap.put("bread", "butter");

        assertEquals(expectedMap, topping1.topping1(actualMap));

    }

}
