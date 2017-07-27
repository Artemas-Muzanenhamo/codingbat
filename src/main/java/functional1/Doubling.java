package functional1;

import java.util.List;

/**
 * Created by artemasm on 27/07/2017.
 */
public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {

            nums.replaceAll(n -> n *  2);
            return nums;
    }
}
