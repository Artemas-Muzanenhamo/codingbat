package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class Left2 {
    public static String left2(String str) {

        // Check if both String `a` and `b` are not empty
        if((!str.isEmpty()) && (str.length() > 1 )){
            return str = str.substring(2, str.length()) + str.substring(0, 2);
        }

        return str;

    }
}
