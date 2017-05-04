package string1;

/**
 * Created by amuzanenhamo on 04/05/2017.
 */
public class Without2 {
    public static String without2(String str) {

        // if `str` is not empty and has a length greater than 1
        if (!str.isEmpty() && str.length() > 1){

            String front2Chars = str.substring(0, 2);
            String back2Chars = str.substring(str.length() - 2, str.length());

            // if 2 chars at the beginning and 2 chars at the end match...
            if (front2Chars.equals(back2Chars)){

                //return `str` String from position 2 to the end of the String
                return str.substring(2, str.length());
            }
        }

        return str;
    }
}
