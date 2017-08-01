package functional1;

import java.util.List;

/**
 * Created by Artemas on 31/07/2017.
 */
public class Lower {
    public List<String> lower(List<String> strings) {

        strings.replaceAll(s -> s.toLowerCase());
        return strings;

    }
}
