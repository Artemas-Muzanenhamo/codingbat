package string1;

/**
 * Created by amuzanenhamo on 25/04/2017.
 */
public class TwoChar {
    public static String twoChar(String str, int index) {

        // if str is not empty
        if(!str.isEmpty() && str.length() > 1){
            // if index value is not bigger than str.length
            if(index < str.length() - 1 && index >= 1){
                return str.substring(index, index + 2);
            }else{
                return str.substring(0, 2);
            }
        }

        return "";


    }
}
