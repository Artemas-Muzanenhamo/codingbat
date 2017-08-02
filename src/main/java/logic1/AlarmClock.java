package logic1;

/**
 * Created by artemasm on 26/06/2017.
 */
public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {

        if ( (day != 6 && day != 0) && !vacation ){
            return "7:00";
        }

        if ( (day == 6 || day == 0) && !vacation ){
            return "10:00";
        }

        if ( (day != 6 && day != 0) && vacation ){
            return "10:00";
        }

        return "off";

    }
}
