package array1;

/**
 * Created by Artemas on 15/06/2017.
 */
public class FrontPeice {
    public static int[] frontPiece(int[] nums) {

        if (nums.length > 2){

            return new int[]{nums[0], nums[1]};
        }

        return nums;
    }
}
