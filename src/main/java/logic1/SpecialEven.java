package logic1;

/**
 * Created by artemasm on 27/06/2017.
 */
public class SpecialEven {
    public static boolean specialEven(int n) {

        if (n % 11 == 0){
            return true;
        }

        if ( (n - 1) % 11 == 0 ){
            return true;
        }

        return false;
    }
}
