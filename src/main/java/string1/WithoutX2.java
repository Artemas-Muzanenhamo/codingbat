package string1;

/**
 * Created by amuzanenhamo on 05/05/2017.
 * Contributor - Tas
 */
public class WithoutX2 {
    public String withoutX2(String str) {

        String value = str;

        // if `str` is not empty
        if (!str.isEmpty()){
            // if `str` contains value `x` at index one then remove `x` and return the string
            if (str.length() > 2){
                value = str.substring(0, 2);

                if (value.contains("x")){
                    str = value.replace("x", "") + str.substring(2, str.length());
                }
            }else {
                if (str.indexOf("x") == 0 || str.indexOf("x") == 1 ){
                    str = str.replace("x", "");
                }
            }
        }

        return str;

    }
}
