package functional2;

import java.util.List;

/**
 * Created by Artemas on 02/08/2017.
 */
public class No34 {
    public List<String> no34(List<String> strings) {

        strings.removeIf(s -> s.length() > 2 && s.length() < 5);
        return strings;
    }
}
