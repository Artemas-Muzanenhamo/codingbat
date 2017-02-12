package warmup2;

/**
 * Created by amuzanenhamo on 11/02/2017.
 */
public class FrontTimes {

    public static String frontTimes(String str, int n){

        String tmp = "";

        if ((!str.isEmpty() && str.length() > 0) && n > 0){

            if (str.length() > 3){

                str = str.substring(0, 3);

            }else{
                str = str.substring(0, str.length());
            }

            for (int i=1; i<=n; i++){
                tmp += str;
            }

            return tmp;

        }else if (n <= 0){
            return "";
        }

        return str;
    }

}
