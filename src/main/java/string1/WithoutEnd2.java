package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class WithoutEnd2 {
    public static String withoutEnd2(String str) {

        if(!str.isEmpty() && str.length() > 1){
            String str1 = str.substring(1);
            return str = str1.substring(0, str1.length() - 1);
        }

        return "";

    }
}
