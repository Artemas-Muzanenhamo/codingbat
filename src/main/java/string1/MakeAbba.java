package string1;

/**
 * Created by amuzanenhamo on 22/04/2017.
 */
public class MakeAbba {
    public String makeAbba(String a, String b) {

        String abba = "";

        if(!a.isEmpty() && !b.isEmpty()){
            abba = a + b + b + a;
        }else{
            abba = a + b + b + a;
        }

        return abba;
    }
}
