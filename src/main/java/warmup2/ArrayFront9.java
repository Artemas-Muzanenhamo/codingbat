package warmup2;

/**
 * Created by amuzanenhamo on 03/04/2017.
 */
public class ArrayFront9 {

    public boolean arrayFront9(int[] nums){

        boolean contains9 = false;

        if (nums != null){

            //if arr is less than 4 elements
            if (nums.length < 4){
                for (int value : nums){
                    if (value == 9){
                        contains9 = true;
                    }
                }
            }else{
                for (int i = 0; i < 4; i++){
                    if (nums[i] == 9){
                        contains9 = true;
                    }
                }
            }
        }

        return contains9;

    }
}
