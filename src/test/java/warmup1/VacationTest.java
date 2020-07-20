package warmup1;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VacationTest {
    //weekday is true if it is a weekday
    //parameter vacation is true if we are on vacation.

    //We sleep in if it is not a weekday or we're on vacation.
    //Return true if we sleep in.

    private Vacation vacation;

    @Before
    public void setup() {
        vacation = new Vacation();
    }

    @Test
    public void when_weekday_and_vacation_is_false_then_return_false() {
        boolean sleepInValue = vacation.sleepIn(false, false);

        assertTrue(sleepInValue);
    }

    @Test
    public void when_weekday_is_false_and_when_vacation_is_true_then_return_true() {
        boolean sleepInValue = vacation.sleepIn(false, true);

        assertTrue(sleepInValue);
    }

    @Test
    public void when_weekday_is_true_and_when_vacation_is_true_then_return_false() {
        boolean sleepInValue = vacation.sleepIn(true, true);

        assertTrue(sleepInValue);
    }

    @Test
    public void when_weekday_is_true_and_when_vacation_is_false_then_return_false() {
        boolean sleepInValue = vacation.sleepIn(true, false);

        assertFalse(sleepInValue);
    }

}