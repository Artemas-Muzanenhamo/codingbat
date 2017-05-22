package map1;

import java.util.Map;

/**
 * Created by amuzanenhamo on 22/05/2017.
 */
public class MapBully {
    public static Map mapBully(Map<String, String> map) {

        if (!map.isEmpty()){

            // check if a has a value
            if (map.containsKey("a")){

                // assign value of a to b
                map.put("b", map.get("a"));
                map.put("a", "");

                return map;

            }

            return map;

        }

        return map;

    }
}
