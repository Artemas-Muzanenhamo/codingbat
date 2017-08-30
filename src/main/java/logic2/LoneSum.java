package logic2;

/**
 * Created by Artemas on 29/08/2017.
 */
public class LoneSum {
    public int loneSum(int a, int b, int c) {

        int sum;

        if (a == b && a == c && b == c){
            sum = 0;
        } else if (a == b){
            sum = c;
        } else if (a == c){
            sum = b;
        } else if (b == c){
            sum = a;
        } else {
            sum = a + b + c;
        }

        return sum;
    }
}
