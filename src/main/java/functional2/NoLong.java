package functional2;

import java.util.List;

/**
 * Created by artemasm on 01/08/2017.
 */
public class NoLong {
    public List<String> noLong(List<String> strings) {

        strings.removeIf(s -> s.length() >= 4);
        return strings;
    }
}
