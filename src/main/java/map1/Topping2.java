package map1;

import java.util.Map;

/**
 * Created by amuzanenhamo on 23/05/2017.
 */
public class Topping2 {
    public static Map<String, String> topping2(Map<String, String> map) {

        if (map.containsKey("ice cream")){

            map.put("yogurt", map.get("ice cream"));

        }

        if (map.containsKey("spinach")){

            map.put("spinach", "nuts");
        }

        return map;
    }
}
