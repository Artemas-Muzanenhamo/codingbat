package array2;

/**
 * Created by artemasm on 07/08/2017.
 */
public class CountEvents {
    public int countEvents(int[] nums) {

        int count = 0;

        for (int number : nums) {
            if (number % 2 == 0){
                count++;
            }
        }
        return count;

    }
}
