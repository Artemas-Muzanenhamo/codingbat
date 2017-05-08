package array1;

/**
 * Created by amuzanenhamo on 08/05/2017.
 */
public class CommonEnd {
    public static boolean commonEnd(int[] a, int[] b) {

        // if `a` && `b` are not empty..
        if (a.length != 0 && b.length != 0){
            // if element 1 in left array == element 1 in right array -> true
            // if last element in left array == last element in right array -> true
            if ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1])){
                return true;
            }
        }

        return false;
    }
}
