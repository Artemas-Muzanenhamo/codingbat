package array1;

/**
 * Created by amuzanenhamo on 09/05/2017.
 */
public class MiddleWay {

    public static int[] middleWay(int[] a, int[] b) {

        int[] arr = {};

        // if array `a` & `b` are not empty..
        if (a.length != 0 && b.length != 0){

            arr = new int[2];
            arr[0] = a[1]; // middle element value from the first array
            arr[1] = b[1]; // middle element value from the second array

            return arr;

        }

        return arr;
    }
}
