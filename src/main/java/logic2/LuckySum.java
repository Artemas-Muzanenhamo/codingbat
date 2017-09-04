package logic2;

/**
 * Created by Artemas on 04/09/2017.
 */
public class LuckySum {
    public int luckySum(int a, int b, int c) {

        int sum = 0;

        if (a == 13){
            return sum;
        } else if (b == 13){
            return a;
        } else if (c == 13){
            return a + b;
        } else {
            sum = a + b + c;
        }

        return sum;
    }
}
