package array1;

/**
 * Created by amuzanenhamo on 08/05/2017.
 */
public class SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {

        // if `nums` is not empty..
        if (nums.length != 0){
            // if index 1 == last index then return true
            if (nums[0] == nums[nums.length - 1]){
                return true;
            }
        }


        return false;

    }
}
