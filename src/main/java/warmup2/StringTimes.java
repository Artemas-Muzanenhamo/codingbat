package warmup2;

/**
 * Created by amuzanenhamo on 11/02/2017.
 */
public class StringTimes {

    public String stringTimes(String str, int n){

        String tmp = "";

        if (str.length() > 0 && n > 1){

            for (int i=1; i<=n; i++){
                tmp += str;
            }

            return tmp;
        } else if(n < 1){
            return "";
        }

        return str;

    }
}
