package string1;

/**
 * Created by amuzanenhamo on 25/04/2017.
 */
public class MiddleThree {
    public String middleThree(String str) {

        // If str is not empty...
        if(!str.isEmpty() && str.length() > 3){
            int middleIndex = str.length() / 2;
            int leftMiddleIndex = middleIndex - 1;
            int rightMiddleIndex = middleIndex + 1;

            return str.substring(leftMiddleIndex, rightMiddleIndex + 1);
        }

        return str;

    }
}
