package string2;

/**
 * Created by Artemas on 17/08/2017.
 */
public class EndOther {
    public boolean endOther(String a, String b) {

        b = b.toLowerCase();
        a = a.toLowerCase();

        if (a.length() < b.length()){
            if (a.equals(b.substring(b.length() - a.length())) ){
                return true;
            }
        }else{
            if(b.equals(a.substring(a.length() - b.length())) ){
                return true;
            }
        }

        return false;
    }
}
