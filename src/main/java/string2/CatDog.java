package string2;

/**
 * Created by artemasm on 26/07/2017.
 */
public class CatDog {
    public static boolean catDog(String str) {

        if (!str.isEmpty()){
            return (str.contains("cat") && str.contains("dog"));
        }
        return false;
    }
}
