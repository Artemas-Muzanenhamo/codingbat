package logic1;

/**
 * Created by artemasm on 27/06/2017.
 */
public class In1To10 {
    public static boolean in1To10(int n, boolean outsideMode) {

        // inside mode
        if ((n >= 1 && n <= 10) && !outsideMode){
            return true;
        }

        // outside mode
        if ((n <= 1 || n >= 10) && outsideMode){
            return true;
        }

        return false;
    }
}
