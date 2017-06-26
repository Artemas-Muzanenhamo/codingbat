package logic1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by artemasm on 26/06/2017.
 *
 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
 * return a string of the form "7:00" indicating when the alarm clock should ring.
 *
 * Weekdays, the alarm should be "7:00"
 * and on the weekend it should be "10:00".
 *
 * Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
 *
 * alarmClock(1, false) → "7:00"
 * alarmClock(5, false) → "7:00"
 * alarmClock(0, false) → "10:00"
 */
public class AlarmClockTest {

    @Test
    public void whenItsAWeekdayAndNotAVacationThenReturn7Oclock(){
        assertEquals("7:00", AlarmClock.alarmClock(1, false));

        // lazy
        assertEquals("7:00", AlarmClock.alarmClock(2, false));
        assertEquals("7:00", AlarmClock.alarmClock(3, false));
        assertEquals("7:00", AlarmClock.alarmClock(4, false));
        assertEquals("7:00", AlarmClock.alarmClock(5, false));
    }

    @Test
    public void whenItsAWeekendAndNotAVacationThenReturn10Oclock(){
        assertEquals("10:00", AlarmClock.alarmClock(6, false));
    }

    @Test
    public void whenItsAWeekdayAndItsAVacationThenReturn10Oclock(){
        assertEquals("10:00", AlarmClock.alarmClock(1, true));

        // lazy
        assertEquals("10:00", AlarmClock.alarmClock(2, true));
        assertEquals("10:00", AlarmClock.alarmClock(3, true));
        assertEquals("10:00", AlarmClock.alarmClock(4, true));
        assertEquals("10:00", AlarmClock.alarmClock(5, true));
    }

    @Test
    public void whenItsAWeekendAndItsAVacationThenReturnOff(){
        assertEquals("off", AlarmClock.alarmClock(6, true));

        // lazy
        assertEquals("off", AlarmClock.alarmClock(0, true));
    }
}
