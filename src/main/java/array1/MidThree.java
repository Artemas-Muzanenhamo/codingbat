package array1;

/**
 * Created by artemasm on 07/06/2017.
 */
public class MidThree {
    public static int[] midThree(int[] nums) {

        if (nums.length > 2){
            if (nums.length % 2 != 0){
                int middleValue = nums[(nums.length - 1) / 2];
                int leftValue = nums[(nums.length - 1 ) / 2 - 1];

                return new int[]{nums[middleValue - 2], nums[middleValue - 1], nums[middleValue]};
            }
        }

        return nums;
    }
}
