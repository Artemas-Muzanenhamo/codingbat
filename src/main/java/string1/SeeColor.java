package string1;

/**
 * Created by amuzanenhamo on 27/04/2017.
 */
public class SeeColor {
    public static String seeColor(String str) {

        String result = "";

        // if str is not empty...
        if (!str.isEmpty() && str.length() > 2){
            if (str.substring(0, 3).equals("red")){
                result =  "red";
            }else if (str.length() > 3 && str.substring(0, 4).equals("blue")){
                result =  "blue";
            }
        }


        return result;

    }
}
