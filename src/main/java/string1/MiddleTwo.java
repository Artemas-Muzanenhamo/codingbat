package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class MiddleTwo {
    public String middleTwo(String str) {

        // Check if str is not empty
        if(!str.isEmpty() && str.length() > 1){

            int index = str.length() / 2;

            return str.substring(index - 1, index + 1);
        }

        return str;

    }
}
