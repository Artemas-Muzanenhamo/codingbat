package array1;

/**
 * Created by amuzanenhamo on 26/05/2017.
 */
public class BiggerTwo {
    public static int[] biggerTwo(int[] a, int[] b) {

        int sumArrayA = 0;
        int sumArrayB = 0;

        if (a.length > 1){

            sumArrayA = a[0] + a[1];

        }

        if (b.length > 1){

            sumArrayB = b[0] + b[1];
        }

        if (sumArrayB > sumArrayA){
            return b;
        }

        return a;
    }
}
