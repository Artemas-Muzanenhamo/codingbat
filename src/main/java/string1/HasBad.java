package string1;

/**
 * Created by amuzanenhamo on 25/04/2017.
 */
public class HasBad {
    public static boolean hasBad(String str) {

        // if str is not empty...
        if (!str.isEmpty() && str.length() > 2){

            // if str contains bad..
            if (str.contains("bad")){
                // if the string `bad` starts at index 0 or 1 then ...
                if(str.indexOf("bad") == 0 || str.indexOf("bad") == 1){
                    // return true
                    return true;
                }
            }

        }

        return false;

    }
}
