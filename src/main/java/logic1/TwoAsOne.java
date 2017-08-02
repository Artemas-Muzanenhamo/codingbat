package logic1;

/**
 * Created by Artemas on 30/06/2017.
 */
public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {

        if (a + b == c){
            return true;
        }

        if (a + c == b){
            return true;
        }

        if (b + c == a){
            return true;
        }

        return false;

    }
}
