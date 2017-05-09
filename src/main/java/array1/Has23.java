package array1;

/**
 * Created by amuzanenhamo on 09/05/2017.
 */
public class Has23 {
    public static boolean has23(int[] nums) {

        // if `nums` is any less than length 1 then return as it is otherwise..
        if (nums.length > 1){
            // if the first element is either 2 or 3 OR if the second element is either 2 or 3 then return true
            if ((nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3)){
                return true;
            }
        }
        return false;
    }
}
