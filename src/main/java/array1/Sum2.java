package array1;

/**
 * Created by amuzanenhamo on 08/05/2017.
 */
public class Sum2 {
    public static int sum2(int[] nums) {

        //if `nums` is not empty...
        if (nums.length != 0){
            if (nums.length > 1){
                return nums[0] + nums[1];
            }else{
                return nums[0];
            }
        }

        return 0;
    }
}
