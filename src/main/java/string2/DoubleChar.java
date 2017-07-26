package string2;

/**
 * Created by artemasm on 26/07/2017.
 */
public class DoubleChar {
    public static String doubleChar(String str) {

        String doubleChar = "";

        if (!str.isEmpty()){
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                doubleChar += str.substring(i, i + 1) + str.substring(i, i + 1);
            }
        }

        return doubleChar;
    }
}
