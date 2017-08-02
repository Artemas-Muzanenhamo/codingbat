package logic1;

/**
 * Created by Artemas on 07/07/2017.
 */
public class SumLimit {
    public int sumLimit(int a, int b) {

        int sum = a + b;
        int aLength = String.valueOf(a).length();
        int sumLength = String.valueOf(sum).length();

        if(sumLength == aLength)
            return sum;

        return a;
    }
}
