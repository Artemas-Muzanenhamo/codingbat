package logic1;

/**
 * Created by Artemas on 04/07/2017.
 */
public class LastDigit {
    public static boolean lastDigit(int a, int b, int c) {

        return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);

    }
}
