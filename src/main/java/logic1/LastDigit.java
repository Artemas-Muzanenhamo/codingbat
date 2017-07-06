package logic1;

/**
 * Created by Artemas on 04/07/2017.
 */
public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {

        int firstSum = 0;
        int secSum = 0;

        Math.abs(firstSum = a - b);
        Math.abs(secSum = a - c);

        if ( (firstSum % a) == (firstSum % b) ){
            return true;
        }

        return false;

    }
}
