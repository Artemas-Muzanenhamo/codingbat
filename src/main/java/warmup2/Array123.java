package warmup2;

/**
 * Created by amuzanenhamo on 28/03/2017.
 */
public class Array123 {

    public static boolean arrayCount123(int[] nums){

        boolean has123 = false;

        boolean one = false;
        boolean two = false;
        boolean three = false;

        if (nums.length != 0){
            for (int a : nums){
                if (a == 1){
                    one = true;
                }

                if (a == 2){
                    two = true;
                }

                if (a == 3){
                    three = true;
                }
            }

            if( one && two && three){
                has123 = true;
            }
        }else{
            has123 = false;
        }

        return has123;
    }
}
