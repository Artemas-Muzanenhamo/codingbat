package logic1;

/**
 * Created by Artemas on 07/07/2017.
 */
public class MaxMod5 {
    public static int maxMod5(int a, int b) {

        if ( (a > b) && (a % 5) != (b % 5) ){
            return a;
        }else if ( (b > a) && (a % 5) != (b % 5) ){
            return b;
        }else if ((a % 5) == (b % 5) && a != b){
            if (a > b){
                return b;
            }else{
                return a;
            }
        }else {
            return 0;
        }

    }
}
