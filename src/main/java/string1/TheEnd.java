package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class TheEnd {
    public static String theEnd(String str, boolean front) {

        // check if `str` is not empty...
        if(!str.isEmpty()){
            // if front is set to true...
            if (front == true){
                // return substring `str` with the first character
                return str.substring(0, 1);
            }else if(front != true){ // if front is set to false...
                // return substring `str` with the last character
                return str.substring(str.length() - 1, str.length());
            }
        }

        return str;

    }
}
