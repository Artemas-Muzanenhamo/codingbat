package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class EndsLy {
    public static boolean endsLy(String str) {

        // if str is not empty
        if (!str.isEmpty() && str.length() > 1){
            // since index starts at 0 we count from 0 to the last index. -1 = Last index.
            if (str.substring(str.length() - 2, str.length()).equals("ly")){
                return true;
            }
        }

        return false;

    }
}
