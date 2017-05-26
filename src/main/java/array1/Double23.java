package array1;

/**
 * Created by amuzanenhamo on 26/05/2017.
 */
public class Double23 {
    public static boolean double23(int[] nums) {

        if (nums.length > 0){
            if (nums.length == 2){

                if (nums[0] == 2 || nums[0] == 3){
                    if (nums[0] == nums[1]){
                        return true;
                    }
                }
            }
        }

        return false;

    }
}
