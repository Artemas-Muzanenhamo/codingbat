package string1;

/**
 * Created by amuzanenhamo on 02/05/2017.
 */
public class FrontAgain {
    public boolean frontAgain(String str) {

        String frontString;
        String backString;

        // if str is not null...
        if (!str.isEmpty() && str.length() > 1){
            frontString = str.substring(0, 2);
            backString = str.substring(str.length() - 2, str.length());

            if (frontString.equals(backString)){
                return true;
            }
        }

        return false;

    }
}
