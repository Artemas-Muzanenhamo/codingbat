package map1;

import java.util.Map;

/**
 * Created by amuzanenhamo on 23/05/2017.
 */
public class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")){

            map.put("ab", map.get("a") + map.get("b"));
        }

        return map;

    }
}
