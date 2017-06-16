package array1;

/**
 * Created by Artemas on 16/06/2017.
 */
public class Make2 {
    public static int[] make2(int[] a, int[] b) {
        int[] result = {};

        if (a.length != 0 && b.length != 0) {
            if (a.length > 1) {
                return new int[]{a[0], a[1]};
            }

            if (b.length > 1) {
                return new int[]{a[0], b[0]};
            }

            return new int[]{a[0], b[0]};

        } else if (a.length != 0) {
            result = new int[]{a[0], a[1]};
        } else if (b.length != 0) {
            result = new int[]{b[0], b[1]};
        }

        return result;
    }
}
