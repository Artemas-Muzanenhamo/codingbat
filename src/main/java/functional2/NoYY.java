package functional2;

import java.util.List;

/**
 * Created by Artemas on 02/08/2017.
 */
public class NoYY {
    public List<String> noYY(List<String> strings) {

        strings.replaceAll(s -> s.concat("y"));
        strings.removeIf(s -> s.contains("yy"));
        return strings;
    }
}
