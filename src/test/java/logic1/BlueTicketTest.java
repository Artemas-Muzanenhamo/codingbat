package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 07/07/2017.
 *
 * You have a blue lottery ticket, with ints a, b, and c on it.
 *
 * This makes three pairs, which we'll call ab, bc, and ac.
 *
 * Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10.
 *
 * Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
 *
 * Otherwise the result is 0.
 *
 * blueTicket(9, 1, 0) → 10
 * blueTicket(9, 2, 0) → 0
 * blueTicket(6, 1, 4) → 10
 */
public class BlueTicketTest {

    private BlueTicket blueTicket;

    @Before
    public void init(){
        blueTicket = new BlueTicket();
    }

    @Test
    public void whenAnyPairSumsToExactly10ThenReturn10(){
        assertEquals(10, blueTicket.blueTicket(9, 1, 0));
    }

    @Test
    public void when_AB_SumIsExactly10MoreThanEither_BC_Or_AC_ThenReturn5(){
        assertEquals(5, blueTicket.blueTicket(20, 30, 10));
    }

}
