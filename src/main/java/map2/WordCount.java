package map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amuzanenhamo on 30/05/2017.
 */
public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        if (strings.length > 0){



            for (String elementValue: strings) {


                if (map.containsKey(elementValue)){
                    int element = map.get(elementValue);
                    map.put(elementValue, element + 1);
                }else{
                    map.put(elementValue, 1);
                }

            }
        }

        return map;
    }
}
