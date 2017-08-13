package warmup2;

/**
 * Created by amuzanenhamo on 03/04/2017.
 */
public class AltPairs {

    public String altPairs(String str) {
        String concat = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i=0; i<str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            concat = concat + str.substring(i, end);
        }

        return concat;
    }

}
