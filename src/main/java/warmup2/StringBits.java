package warmup2;

/**
 * Created by amuzanenhamo on 16/03/2017.
 */
public class StringBits {

    public static String stringBits(String str){

        int stringLength;
        String[] strArr;
        String tmp = "";

        if(str != null){
            stringLength = str.length();
            strArr = str.split("");

            for(int i=0; i < stringLength; i++) {

                if((i % 2) == 0){
                    tmp+= strArr[i];
                }
            }

            str = tmp;

        }else{
            str = "";
        }

        return str;
    }
}
