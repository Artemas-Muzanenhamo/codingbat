package recursion1;

/**
 * Created by artemasm on 04/08/2017.
 */
public class BunnyEars {
    public int bunnyEars(int bunnies) {

        if (bunnies == 0){
            return 0;
        }else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }
}
