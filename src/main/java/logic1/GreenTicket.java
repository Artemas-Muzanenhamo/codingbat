package logic1;

/**
 * Created by Artemas on 07/07/2017.
 */
public class GreenTicket {
    public static int greenTicket(int a, int b, int c) {

        if (a == b && b == c){
            return 20;
        }else if (a == b || b == c || a == c){
            return 10;
        }

        return 0;
    }
}
