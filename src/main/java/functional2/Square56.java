package functional2;

import java.util.List;

/**
 * Created by Artemas on 02/08/2017.
 */
public class Square56 {
    public List<Integer> square56(List<Integer> nums) {

        nums.replaceAll(n -> (n * n) + 10 );
        nums.removeIf(n -> n % 10 == 5 || n % 10 == 6);
        return nums;
    }
}
