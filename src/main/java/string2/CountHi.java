package string2;

/**
 * Created by artemasm on 26/07/2017.
 */
public class CountHi {
    public int countHi(String str) {

        int count = 0;

        if (!str.isEmpty()){
            for (int i = 0; i < str.length() - 1; i++){
                if (str.substring(i, i + 1).equals("h") && str.substring(i + 1, i + 2).equals("i")){
                    count++;
                }
            }
        }
        return count;
    }
}
