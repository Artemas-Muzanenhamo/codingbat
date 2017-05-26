package array1;

/**
 * Created by amuzanenhamo on 26/05/2017.
 */
public class MakeLast {
    public static int[] makeLast(int[] nums) {

        if (nums.length > 0){

            int lastIndexValue = nums[nums.length - 1];
            int[] array = new int[nums.length * 2];

            array[array.length - 1] = lastIndexValue;

            return array;

        }

        return nums;

    }
}
