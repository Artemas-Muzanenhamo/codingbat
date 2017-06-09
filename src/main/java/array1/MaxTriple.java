package array1;

/**
 * Created by Artemas on 08/06/2017.
 */
public class MaxTriple {
    public static int maxTriple(int[] nums) {

        int highestValue = 0;

        if (nums.length > 0){
            if (nums.length % 2 != 0){
                if (nums.length < 2){
                    highestValue = nums[0];
                }
            }
        }

        return highestValue;

    }
}
