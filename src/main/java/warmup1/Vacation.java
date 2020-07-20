package warmup1;


/**
 *
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 */
public class Vacation {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false && vacation == false) {
            return true;
        }

        if (weekday && vacation) {
            return true;
        }

        return vacation;
    }
}
