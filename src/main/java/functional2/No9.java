package functional2;

import java.util.List;

/**
 * Created by artemasm on 01/08/2017.
 */
public class No9 {
    public List<Integer> no9(List<Integer> nums) {

        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
}
