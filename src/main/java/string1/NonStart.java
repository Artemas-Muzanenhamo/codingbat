package string1;

/**
 * Created by amuzanenhamo on 24/04/2017.
 */
public class NonStart {
    public String nonStart(String a, String b) {

        // Check if both `a` and `b` are not empty...
        if((!a.isEmpty() && !b.isEmpty()) && (a.length() > 1 && b.length() > 1)){
            // return string made of two strings minus their first chars.
            return a = a.substring(1, a.length()) + b.substring(1, b.length());
        }else if(!a.isEmpty() && a.length() > 1){ //if first string passed is not empty and greater than 1...
            // return first string minus its first char
            return a.substring(1, a.length());
        }else if(!b.isEmpty() && b.length() > 1){//if second string passed is not empty and greater than 1...
            // return second string minus its first char
            return b.substring(1, b.length());
        }

        return "";
    }
}
