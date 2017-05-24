package map1;

import java.util.Map;

/**
 * Created by amuzanenhamo on 24/05/2017.
 */
public class Topping3 {
    public static Map<String, String> topping3(Map<String, String> map) {

        if (map.containsKey("potato")){

            map.put("fries", map.get("potato"));

        }

        if (map.containsKey("salad")){

            map.put("spinach", map.get("salad"));

        }

        return map;
    }
}
