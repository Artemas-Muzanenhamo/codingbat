package recursion1;

/**
 * Created by Artemas on 03/08/2017.
 */
public class Factorial {
    public int factorial(int n) {
        if (n > 1){
            return n * factorial(n - 1);
        }else {
            return n;
        }
    }
}
