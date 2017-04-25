package string1;

/**
 * Created by amuzanenhamo on 25/04/2017.
 */
public class AtFirst {
    public static String atFirst(String str) {

        // if str is not empty...
        if(!str.isEmpty()){
            //if str length is one
            if (str.length() == 1){
                return str + "@";
            }else if(str.length() == 2){ //if str length is 2...
                return str;
            }else { //otherwise..
                // return the first 2 chars
                return str.substring(0, 2);
            }
        }

        return "@@";
    }
}
