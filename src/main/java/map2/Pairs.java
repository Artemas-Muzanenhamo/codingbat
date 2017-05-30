package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amuzanenhamo on 30/05/2017.
 */
public class Pairs {
    public static Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();

        if (strings.length > 0){

            for (String elementValue: strings) {
                map.put(elementValue.substring(0, 1), elementValue.substring(elementValue.length() - 1));
            }

        }

        return map;

    }
}
