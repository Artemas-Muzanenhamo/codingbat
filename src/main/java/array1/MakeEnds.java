package array1;

/**
 * Created by amuzanenhamo on 09/05/2017.
 */
public class MakeEnds {
    public static int[] makeEnds(int[] nums) {

        int[] arr;
        //if `nums` is not empty..
        if (nums.length >= 1){

            // initialize our new array object to hold the two elements we want
            arr = new int[2];

            // assign element 1's value of the array to our new `arr` array's first index.
            arr[0] = nums[0];

            // assign the last element value of the array to our new `arr` array's second index.
            arr[1] = nums[nums.length - 1];

            return arr;

        }

        return nums;
    }
}
