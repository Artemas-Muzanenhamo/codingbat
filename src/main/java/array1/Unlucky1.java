package array1;

/**
 * Created by Artemas on 16/06/2017.
 */
public class Unlucky1 {
    public static boolean unlucky1(int[] nums) {

        if (nums.length > 1){

            if (nums[0] == 1 && nums[1] == 3){
                return true;
            }else if (nums[1] == 1 && nums[2] == 3){
                return true;
            }else if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3){
                return true;
            }

            return false;
        }

        return false;
    }
}
