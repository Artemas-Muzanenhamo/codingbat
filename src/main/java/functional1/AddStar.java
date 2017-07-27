package functional1;

import java.util.List;

/**
 * Created by artemasm on 27/07/2017.
 */
public class AddStar {
    public static List<String> addStart(List<String> strings) {

        if (!strings.isEmpty()){
            strings.replaceAll(n -> n.concat("*"));
        }

        return strings;
    }
}
