package array1;

/**
 * Created by amuzanenhamo on 08/05/2017.
 */
public class MaxEnd3 {
    public static int[] maxEnd3(int[] nums) {

        // if `nums` is not empty..
        if (nums.length != 0){
            // check which value is the largest between the first element vs last element
            if (nums[0] > nums[nums.length - 1]){
                int[] arr = new int[3];
                arr[0] = nums[0];
                arr[1] = arr[0];
                arr[2] = arr[0];

                return arr;
            }else{
                int[] arr = new int[3];
                arr[0] = nums[2];
                arr[1] = arr[0];
                arr[2] = arr[0];

                return arr;
            }
        }

        return nums;
    }
}
