package logic1;

/**
 * Created by Artemas on 30/06/2017.
 */
public class FizzString2 {

    public static String fizzString(int n) {

        if (n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz!";
        }else if (n % 3 == 0){
            return "Fizz!";
        }else if (n % 5 == 0){
            return "Buzz!";
        }

        return n + "!";

    }
}
