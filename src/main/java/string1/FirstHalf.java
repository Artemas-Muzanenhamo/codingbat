package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class FirstHalf {
    public String firstHalf(String str) {

        // check to see if the string is not empty && if its length is greater than 1
        if(!str.isEmpty() && str.length() > 1){
            // String str = the first half of the string passed in.
            str = str.substring(0, str.length() / 2);
        }

        return str;

    }
}
