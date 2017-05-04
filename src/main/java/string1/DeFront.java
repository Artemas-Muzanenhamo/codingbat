package string1;

/**
 * Created by amuzanenhamo on 04/05/2017.
 */
public class DeFront {
    public static String deFront(String str) {

        String firstChar = "";
        String secondChar = "";

        // if `str` is not empty
        if (!str.isEmpty()){

            // if first char equals to `a` then append the string
            if (str.substring(0, 1).equals("a")){
                firstChar = str.substring(0, 1);
            }

            // if we check `b` as second char then we assume its larger than length 1
            if (str.length() > 1){
                if(str.substring(1, 2).equals("b")){
                    secondChar = str.substring(1, 2);
                }
            }

            // if str is length < 2
            if (str.length() < 2){
                return str = firstChar;
            }else{
                return str = firstChar + secondChar + str.substring(2, str.length());
            }

        }

        return str;

    }
}
