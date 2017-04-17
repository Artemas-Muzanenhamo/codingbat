package warmup2;

/**
 * Created by amuzanenhamo on 16/04/2017.
 */
public class StringYak {

    public static String stringYakPak(String str) {

        String result = "";

        if(!str.isEmpty() && str.length() > 2 && str.indexOf("yak") != -1){
            str = str.replace("yak", "");
            result = str;
        }else{
            result = str;
        }

        return result;
    }
}
