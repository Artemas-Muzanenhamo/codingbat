package logic1;

/**
 * Created by Artemas on 03/07/2017.
 */
public class InEqualOrder {
    public boolean inEqualOrder(int a, int b, int c, boolean equalOk) {

        if ( b > a && c > b && !equalOk){
            return true;
        }
        else if (b >= a && c >= b && equalOk){
            return true;
        }else{
            return false;
        }

    }
}
