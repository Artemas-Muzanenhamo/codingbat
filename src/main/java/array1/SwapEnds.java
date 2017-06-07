package array1;

/**
 * Created by artemasm on 07/06/2017.
 */
public class SwapEnds {
    public static int[] swapEnds(int[] nums) {

        int firstArray = 0;
        int lastArray = 0;
        int[] array = {};

        if (nums.length > 0 ){

            firstArray = nums[0];
            lastArray = nums[nums.length - 1];

            nums[0] = lastArray;
            nums[nums.length - 1] = firstArray;

            return nums;
        }

        return array;
    }
}
