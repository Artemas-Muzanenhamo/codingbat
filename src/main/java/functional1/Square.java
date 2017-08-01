package functional1;

import java.util.List;

/**
 * Created by artemasm on 27/07/2017.
 */
public class Square {
    public List<Integer> square(List<Integer> nums) {

        nums.replaceAll(n -> n * n);
        return nums;
    }
}
