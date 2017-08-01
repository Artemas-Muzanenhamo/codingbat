package functional1;

import java.util.List;

/**
 * Created by artemasm on 28/07/2017.
 */
public class Math1 {
    public List<Integer> math(List<Integer> nums) {

        nums.replaceAll(n -> (n + 1) * 10 );
        return nums;

    }
}
