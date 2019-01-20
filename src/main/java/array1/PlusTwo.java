package array1;

/**
 * Created by artemasm on 06/06/2017.
 */
class PlusTwo {
    int[] plusTwo(int[] a, int[] b) {

        int[] array = {};

        if (a.length > 1 && b.length > 1){

            array = new int[4];

            array[0] = a[0];
            array[1] = a[1];
            array[2] = b[0];
            array[3] = b[1];

            return array;

        }

        return array;
    }
}
