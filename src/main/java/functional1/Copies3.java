package functional1;

import java.util.List;

/**
 * Created by artemasm on 28/07/2017.
 */
public class Copies3 {
    public static List<String> copies3(List<String> strings) {

        strings.replaceAll(n -> n.concat(n + n));
        return strings;
    }
}