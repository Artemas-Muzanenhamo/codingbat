package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class ExtraEnd {
    public String extraEnd(String str) {

        String end = "";

        // If String str is not empty and it's length is greater than 1...
        if(!str.isEmpty() && str.length() > 1){
            //String end = the last two characters of the String str
            end = str.substring(str.length() - 2, str.length());
            //String str = three copies of the last two characters.
            str = end + end + end;
        }

        return str;

    }
}
