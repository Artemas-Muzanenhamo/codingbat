package logic1;

/**
 * Created by Artemas on 30/06/2017.
 */
public class InOrder {

    public static boolean inOrder(int a, int b, int c, boolean bOk) {

        if ( (b >= a) && (c >= b)  && !bOk){
            return true;
        }

        if (c > b && bOk){
            return true;
        }

        return false;
    }
}
