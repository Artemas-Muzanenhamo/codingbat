package recursion1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 04/08/2017.
 *
 * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
 *
 * bunnyEars(0) → 0
 * bunnyEars(1) → 2
 * bunnyEars(2) → 4
 */
public class BunnyEarsTest {

    private BunnyEars bunnyEars;

    @Before
    public void init(){
        bunnyEars = new BunnyEars();
    }

    @Test
    public void whenBunnyArePassedThenReturnTheNumberOfEars(){
        assertEquals(2, bunnyEars.bunnyEars(1));
    }

}
