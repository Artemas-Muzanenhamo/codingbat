package logic1;

/**
 * Created by artemasm on 27/06/2017.
 */
public class Old35 {
    public boolean old35(int n) {

        if ( (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0) ){
            return true;
        }

        return false;
    }
}
