package map1;

import java.util.Map;

/**
 * Created by amuzanenhamo on 23/05/2017.
 */
public class MapShare {

    public Map<String, String > mapShare(Map<String, String> map) {

        if (map.containsKey("a")){
            map.put("b", map.get("a"));
        }

        if (map.containsKey("c")){
            map.remove("c");
        }

       return map;
    }
}
