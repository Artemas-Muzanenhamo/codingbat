package array1;

/**
 * Created by amuzanenhamo on 26/05/2017.
 */
public class Fix23 {
    public static int[] fix23(int[] nums) {

        if (nums.length > 2){

            if ( nums[0] == 2 && nums[1] == 3 ){

                nums[1] = 0;

            }else if ( nums[1] == 2 && nums[2] == 3 ){
                nums[2] = 0;
            }

        }
        return nums;
    }
}
