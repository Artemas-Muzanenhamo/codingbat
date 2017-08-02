package functional2;

import java.util.List;

/**
 * Created by Artemas on 02/08/2017.
 */
public class Two2 {
    public List<Integer> two2(List<Integer> nums) {

        nums.replaceAll(n -> n * 2);
        nums.removeIf( n -> n == 2 || n % 10 == 2 );
        return nums;
    }
}
