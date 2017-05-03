package string1;

/**
 * Created by amuzanenhamo on 03/05/2017.
 */
public class MinCat {
    public static String minCat(String a, String b) {

        String concatString = ""; //because I don't want to handle `null`

        // if both `a` and `b` are not empty...
        if (!a.isEmpty() && !b.isEmpty()) {
            // if `a` & `b` are equal in length...
            if (a.length() == b.length()) {
                // concat the two and return
                concatString = a.concat(b);
            } else if (a.length() > b.length()) {
                concatString = a.substring(a.length() - b.length(), a.length()).concat(b);
            } else if (b.length() > a.length()) {
                concatString = a.concat(b.substring(b.length() - a.length(), b.length()));
            }
            }

        return concatString;

    }
}
