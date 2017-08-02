package functional2;

import java.util.List;

/**
 * Created by Artemas on 02/08/2017.
 */
public class NoZ {
    public List<String> noZ(List<String> strings) {

        strings.removeIf(s -> s.contains("z"));
        return strings;
    }
}
