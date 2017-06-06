package array1;

/**
 * Created by artemasm on 06/06/2017.
 */
public class MakeMiddle {
    public static int[] makeMiddle(int[] nums) {

        if (nums.length % 2 == 0 && nums.length > 0){

            int leftSide = nums[(nums.length / 2) - 1];
            int rightSide = nums[nums.length / 2];

            nums = new int[2];
            nums[0] = leftSide;
            nums[1] = rightSide;

            return nums;
        }

        return nums;
    }
}
