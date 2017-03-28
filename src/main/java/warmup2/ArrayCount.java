package warmup2;

/**
 * Created by amuzanenhamo on 28/03/2017.
 */
public class ArrayCount {

    public static int arrayCount(int[] nums){

        int count = 0;

        for (int a : nums){
            if (a > 0){
                if (a == 9){
                    count++;
                }
            }else{
                count = 0;
            }
        }

        return count;
    }
}
