package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class Right2 {
    public String right2(String str) {

        // Check if String str is not empty && is at least length 1
        if(!str.isEmpty() && str.length() > 1){
            return str = str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
        }

        return str;

    }
}
