package array1;

/**
 * Created by amuzanenhamo on 05/05/2017.
 *
 * Given an array of ints, return true if 6 appears as either the first or last element in the array.
 * The array will be length 1 or more.
 *
 * firstLast6([1, 2, 6]) → true
 * firstLast6([6, 1, 2, 3]) → true
 * firstLast6([13, 6, 1, 2, 3]) → false
 */
public class FirstLast6 {
    public static boolean firstLast6(int[] nums) {

        // if `nums` is not empty..
        if (nums.length != 0){
            // if first index or last index == 6 ...
            if (nums[0] == 6 || nums[nums.length - 1] == 6){
                // return true
                return true;
            }
        }

        return false;
    }
}
