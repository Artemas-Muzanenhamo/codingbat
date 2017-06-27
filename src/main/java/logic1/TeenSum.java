package logic1;

/**
 * Created by Artemas on 28/06/2017.
 */
public class TeenSum {
    public static int teenSum(int a, int b) {

        if ( (a < 13 || a > 19) && (b < 13 || b > 19) ){
            return a + b;
        }

        return 19;
    }
}
