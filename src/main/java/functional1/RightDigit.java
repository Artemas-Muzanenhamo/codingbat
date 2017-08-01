package functional1;

import java.util.List;

/**
 * Created by artemasm on 01/08/2017.
 */
public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {

        nums.replaceAll(n -> n % 10);
        return nums;

    }
}
