package array1;

/**
 * Created by artemasm on 07/06/2017.
 */
public class MidThree {
    public static int[] midThree(int[] nums) {

        if (nums.length > 2){
            if (nums.length % 2 != 0){
                int middleIndex = (nums.length - 1) / 2;
                int leftIndex = ((nums.length - 1) / 2) - 1;
                int rightIndex = ((nums.length - 1) / 2) + 1;

                return new int[]{nums[leftIndex], nums[middleIndex], nums[rightIndex]};
            }
        }

        return nums;
    }
}
