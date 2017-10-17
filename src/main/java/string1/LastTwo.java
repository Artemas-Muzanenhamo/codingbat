package string1;

/**
 * Created by amuzanenhamo on 27/04/2017.
 */
public class LastTwo {
    public String lastTwo(String str) {

        String secondLastIndex = "";
        String lastIndex = "";

        // if str is not empty...
        if (!str.isEmpty() && str.length() > 1){
            secondLastIndex = str.substring(str.length() - 2, str.length() - 1);
            lastIndex = str.substring(str.length() - 1, str.length());
            str = str.substring(0, str.length() - 2);
            str = str.concat(lastIndex + secondLastIndex);
        }

        return str;

    }
}
