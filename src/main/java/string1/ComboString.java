package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class ComboString {
    public String comboString(String a, String b) {

        // Check if both `a` and `b` are not empty
        if(!a.isEmpty() && !b.isEmpty()){
            if(a.length() > b.length()){
                return b + a + b;
            }else{
                return a + b + a;
            }
        }else if(a.isEmpty()){
            return b;
        }else if(b.isEmpty()){
            return a;
        }

        return "";

    }
}
