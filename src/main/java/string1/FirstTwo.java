package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class FirstTwo {
    public String firstTwo(String str) {

        // If String str is not empty and it's length is greater than 1...
        if (!str.isEmpty() && str.length() > 1){
            // String str = the first 2 characters of the string
            str = str.substring(0, 2);
        }

        return str;
    }
}
