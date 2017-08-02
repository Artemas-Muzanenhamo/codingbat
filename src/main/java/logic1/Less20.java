package logic1;

/**
 * Created by artemasm on 27/06/2017.
 */
public class Less20 {
    public boolean less20(int n) {

        if ( (n + 2) % 20 == 0 || (n + 1) % 20 == 0 ){
            return true;
        }

        return false;
    }
}
