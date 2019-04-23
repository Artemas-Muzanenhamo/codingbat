package map2;

import java.util.HashMap;
import java.util.Map;

class WordMultiple {
    Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        if (strings.length > 0) {
            for (String elementKey : strings) {
                if (map.containsKey(elementKey)) {
                    map.put(elementKey, true);
                } else {
                    map.put(elementKey, false);
                }
            }
        }

        return map;
    }
}
