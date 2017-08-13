package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amuzanenhamo on 30/05/2017.
 */
public class Word0 {

    public Map<String,Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        if (strings.length > 0){

            for (String element: strings) {
                map.put(element, 0);
            }

        }


        return map;
    }
}
