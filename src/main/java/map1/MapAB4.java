package map1;

import java.util.Map;

/**
 * Created by amuzanenhamo on 24/05/2017.
 */
public class MapAB4 {
    public static Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")){

            if (map.get("a").length() > map.get("b").length()){
                map.put("c", map.get("a"));
            }

            if (map.get("a").length() < map.get("b").length()){
                map.put("c", map.get("b"));
            }

            if (map.get("a").length() == map.get("b").length()){
                map.put("a", "");
                map.put("b", "");
            }

        }

        return map;
    }
}
