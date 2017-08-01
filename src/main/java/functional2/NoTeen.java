package functional2;

import java.util.List;

/**
 * Created by artemasm on 01/08/2017.
 */
public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {

        nums.removeIf(n -> n > 12 && n < 20 );
        return nums;
    }
}
