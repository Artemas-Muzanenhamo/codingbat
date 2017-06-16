package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artemas on 16/06/2017.
 */
public class WordAppend {
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String result = "";

        for (int i = 0; i < strings.length; i++) {

            String key = strings[i];

            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                if (val % 2 == 0) {
                    result += key;
                }
                map.put(key, val);
            } else {
                map.put(key, 1);
            }

        }

        return result;
    }
}
