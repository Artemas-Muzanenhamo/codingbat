package array1;

/**
 * Created by amuzanenhamo on 08/05/2017.
 */
public class Reverse3 {
    public static int[] reverse3(int[] nums) {

        // if `nums` is not empty...
        if (nums.length != 0){
            int[] arr = new int[3];

            arr[0] = nums[2]; //last element goes in at the first index
            arr[1] = nums[1]; //middle element does not move
            arr[2] = nums[0]; //first element goes in at the last index

            return arr;
        }

        return nums;
    }
}
