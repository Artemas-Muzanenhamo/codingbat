package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 07/07/2017.
 *
 * You have a green lottery ticket, with ints a, b, and c on it.
 *
 * If the numbers are all different from each other, the result is 0.
 *
 * If all of the numbers are the same, the result is 20.
 *
 * If two of the numbers are the same, the result is 10.
 *
 * greenTicket(1, 2, 3) → 0
 * greenTicket(2, 2, 2) → 20
 * greenTicket(1, 1, 2) → 10
 */
public class GreenTicketTest {

    @Test
    public void whenAllTheNumbersAreDifferentThenReturn0(){
        assertEquals(0, GreenTicket.greenTicket(1, 2, 3));
    }

    @Test
    public void whenAllTheNumbersAreTheSameThenReturn20(){
        assertEquals(20, GreenTicket.greenTicket(2, 2, 2));
    }

    @Test
    public void whenTwoOfTheNumbersAreTheSameThenReturn10(){
        assertEquals(10, GreenTicket.greenTicket(1, 1, 2));

        //lazy
        assertEquals(10, GreenTicket.greenTicket(1, 2, 1));
        assertEquals(10, GreenTicket.greenTicket(1, 2, 2));
    }
}
