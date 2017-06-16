package array1;

/**
 * Created by Artemas on 16/06/2017.
 */
public class Front11 {
    public static int[] front11(int[] a, int[] b) {

        int[] result = {};

        if (a.length != 0 && b.length != 0){
            result = new int[]{a[0], b[0]};
        } else if (b.length != 0){

            result = new int[]{b[0]};
        } else if (a.length != 0){

            result = new int[]{a[0]};
        }

        return result;
    }
}
