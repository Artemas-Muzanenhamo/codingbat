package string1;

/**
 * Created by amuzanenhamo on 25/04/2017.
 */
public class NTwice {
    public String nTwice(String str, int n) {

        // if str is not empty or n is not 0 ...
        if (!str.isEmpty() && n > 0){
            return str.substring(0, n) + str.substring(str.length() - n, str.length());
        }

        return "";

    }
}
