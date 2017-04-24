package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class WithoutEnd {
    public static String withoutEnd(String str) {

        // Check is 'str' is not empty
        if (!str.isEmpty() && str.length() > 1){
            // Substring the First Character
            String str1 = str.substring(1);
            // Substring the last Character
            str = str1.substring(0, str1.length() - 1);

        }

        return str;

    }
}
