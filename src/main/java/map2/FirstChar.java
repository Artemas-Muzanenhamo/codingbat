package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amuzanenhamo on 31/05/2017.
 */
public class FirstChar {
    public static Map<String,String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        if (strings.length > 0){
            for (String word: strings) {

                if (map.containsKey(word.substring(0, 1))){
                    String value = word;
                    map.put(word.substring(0, 1), map.get(word.substring(0, 1)) + value);
                }else{
                    map.put(word.substring(0, 1), word);
                }
            }
        }

        return map;
    }
}
