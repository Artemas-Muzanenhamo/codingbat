package array1;

/**
 * Created by amuzanenhamo on 26/05/2017.
 */
public class Start1 {
    public int start1(int[] a, int[] b) {

        int count = 0;

        if (a.length > 0){
            if (a[0] == 1){
                count += 1;
            }
        }

        if (b.length > 0){
            if (b[0] == 1){
                count += 1;
            }
        }

        return count;

    }
}
