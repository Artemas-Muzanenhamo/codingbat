package warmup2;

/**
 * Created by amuzanenhamo on 28/03/2017.
 */
public class StringMatch {

    public static int stringMatch(String a, String b){

        int count = 0;
        int len = Math.min(a.length(), b.length());

        String longestString;
        String shortString;

        //check if the string are not empty
        if (!a.isEmpty() || !b.isEmpty()) {

            // if shortestString.subString(0, 2) exists in the longestString
            for (int i = 0; i < len-1; i++) {
                String aSub = a.substring(i, i+2);
                String bSub = b.substring(i, i+2);
                if (aSub.equals(bSub)){
                    count++;
                }
            }
        } else {
            count = 0;
        }

        return count;
    }

}
