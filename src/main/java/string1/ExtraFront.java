package string1;

/**
 * Created by amuzanenhamo on 04/05/2017.
 */
public class ExtraFront {
    public String extraFront(String str) {

        // if `str` is not empty...
        if (!str.isEmpty()){

            // if `str.length()` is less than 2 then return 3 copies of the string
            if (str.length() < 2){
                return str + str + str;
            }else{
                // otherwise just return 3 copies of the first 2 chars of `str`.
                String twoChars = str.substring(0, 2);
                return twoChars + twoChars + twoChars;
            }
        }

        return str;

    }
}
