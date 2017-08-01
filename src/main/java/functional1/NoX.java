package functional1;

import java.util.List;

/**
 * Created by artemasm on 01/08/2017.
 */
public class NoX {
    public static List<String> noX(List<String> strings) {

        strings.replaceAll(s -> s.replace("x", ""));
        return strings;

    }
}
