package string1;

/**
 * Created by amuzanenhamo on 26/04/2017.
 */
public class LastChars {
    public static String lastChars(String a, String b) {

        String value = "@@";

        // if both a and b are not empty
        if (!a.isEmpty() && !b.isEmpty()){
            return a.substring(0, 1) + b.substring(b.length() - 1, b.length());
        }else if(a.isEmpty() && !b.isEmpty()){
            value = "@" + b.substring(b.length() - 1, b.length());
        }else if(b.isEmpty() && !a.isEmpty()){
            value = a.substring(0, 1) + "@";
        }

        return value;

    }
}
