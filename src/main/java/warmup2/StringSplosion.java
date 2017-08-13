package warmup2;

/**
 * Created by amuzanenhamo on 16/03/2017.
 */
public class StringSplosion {

    public String stringSplosion(String str) {

        String tmp = "";
        int counter = 1;

        if (str != null) {

            for (int i = 0; i < str.length(); i++) {

                tmp += str.substring(0, counter);

                counter++;

            }

            str = tmp;

        } else {
            return "";
        }

        return str;
    }
}
