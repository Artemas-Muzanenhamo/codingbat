package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amuzanenhamo on 30/05/2017.
 */
class WordLen {
    Map<String,Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        if (strings.length > 0){

            for (String elementValue: strings) {
                map.put(elementValue, elementValue.length());
            }

        }

        return map;

    }
}
