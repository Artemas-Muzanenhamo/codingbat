package array1;

/**
 * Created by amuzanenhamo on 08/05/2017.
 */
public class RotateLeft3 {
    public static int[] rotateLeft3(int[] nums) {

        int[] arr = {};

        // if `nums` is not empty
        if (nums.length != 0){

            arr = new int[3];

            arr[0] = nums[1]; // middle element's value will move to the first index
            arr[1] = nums[2]; // last element's value will move to the second index
            arr[2] = nums[0]; // first element's value will move to the last index

            return arr;
        }
        return arr;
    }
}
