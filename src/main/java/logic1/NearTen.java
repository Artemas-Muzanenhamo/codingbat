package logic1;

/**
 * Created by artemasm on 27/06/2017.
 */
public class NearTen {
    public boolean nearTen(int num) {

        if ( (num - 2 ) % 10 == 0 || (num + 2 ) % 10 == 0 || (num - 1 ) % 10 == 0 || (num + 1 ) % 10 == 0 || num % 10 == 0 ){
            return true;
        }

        return false;
    }
}
