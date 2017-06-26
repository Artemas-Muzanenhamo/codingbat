package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by artemasm on 26/06/2017.
 *
 * You are driving a little too fast, and a police officer stops you.
 * Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
 *
 * If speed is 60 or less, the result is 0.
 *
 * If speed is between 61 and 80 inclusive, the result is 1.
 *
 * If speed is 81 or more, the result is 2.
 *
 * Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
 *
 * caughtSpeeding(60, false) → 0
 * caughtSpeeding(65, false) → 1
 * caughtSpeeding(65, true) → 0
 */
public class CaughtSpeedingTest {

    @Test
    public void whenSpeedIsLessThan60ThenReturn0(){
        assertEquals(0, CaughtSpeeding.caughtSpeeding(50, false));

        assertEquals(0, CaughtSpeeding.caughtSpeeding(60, false));
    }

    @Test
    public void whenSpeedIsMoreThan60ButLessThan80AndNotYourBirthdayThenReturn1(){
        assertEquals(1, CaughtSpeeding.caughtSpeeding(61, false));

        assertEquals(1, CaughtSpeeding.caughtSpeeding(80, false));
    }

    @Test
    public void whenSpeedIsMoreThan80AndItsNotYourBirthdayThenReturn2(){
        assertEquals(2, CaughtSpeeding.caughtSpeeding(85, false));
    }

    @Test
    public void whenSpeedIs65AndItsYourBirthdayThenReturn0(){
        assertEquals(0, CaughtSpeeding.caughtSpeeding(65, true));
    }

    @Test
    public void whenSpeedIs85AndItsYourBirthdayThenReturn1(){
        assertEquals(1, CaughtSpeeding.caughtSpeeding(85, true));
    }

}
