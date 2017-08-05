package recursion1;

/**
 * Created by Artemas on 05/08/2017.
 */
public class Fibonacci {
    public int fibonacci(int n) {

        if (n <= 1){
            return n;
        }else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
