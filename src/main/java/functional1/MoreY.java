package functional1;

import java.util.List;

/**
 * Created by artemasm on 28/07/2017.
 */
public class MoreY {
    public static List<String> moreY(List<String> strings) {

        strings.replaceAll(n -> "y"+n+"y");
        return strings;
    }
}
