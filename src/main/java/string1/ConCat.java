package string1;

/**
 * Created by amuzanenhamo on 27/04/2017.
 */
public class ConCat {
    public String conCat(String a, String b) {

        String result = "";

        // if a and b are not empty
        if (!a.isEmpty() && !b.isEmpty()){

            if(a.substring(a.length() - 1, a.length()).equals(b.substring(0, 1))){
                a = a.substring(0, a.length() - 1);
                result = a.concat(b);
            }else{
                result = a.concat(b);
            }
        }else if(a.isEmpty()){
            result = a.concat(b);
        }else if(b.isEmpty()){
            result = b.concat(a);
        }

        return result;

    }
}
