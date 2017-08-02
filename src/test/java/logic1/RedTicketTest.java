package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 07/07/2017.
 *
 * You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
 *
 * If they are all the value 2, the result is 10.
 *
 * Otherwise if they are all the same, the result is 5.
 *
 * Otherwise so long as both b and c are different from a, the result is 1.
 *
 * Otherwise the result is 0.
 *
 * redTicket(2, 2, 2) → 10
 * redTicket(2, 2, 1) → 0
 * redTicket(0, 0, 0) → 5
 */
public class RedTicketTest {
    
    private RedTicket redTicket;
    
    @Before
    public void init(){
        redTicket = new RedTicket();
    }

    @Test
    public void whenAllTheValuesAre2ThenReturn10(){
        assertEquals(10, redTicket.redTicket(2, 2, 2));
    }

    @Test
    public void whenAllTheValuesAreTheSameButNot2_2_2ThenReturn5(){
        assertEquals(5, redTicket.redTicket(3, 3, 3));
    }

    @Test
    public void whenBothB_And_C_AreDifferentFromAThenReturn1(){
        assertEquals(1, redTicket.redTicket(1, 2, 2));

        assertEquals(1, redTicket.redTicket(1, 2, 0));
    }

    @Test
    public void whenAllTheValuesAreDifferentFromEachOtherThenReturn0(){

        assertEquals(0, redTicket.redTicket(2, 2, 1));
    }
}
