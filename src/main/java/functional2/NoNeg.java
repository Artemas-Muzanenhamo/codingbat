package functional2;

import java.util.List;

/**
 * Created by artemasm on 01/08/2017.
 */
public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {

        nums.removeIf(n -> n < 0);
        return nums;

    }
}
