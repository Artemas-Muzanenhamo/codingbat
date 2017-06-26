package logic1;

/**
 * Created by artemasm on 26/06/2017.
 */
public class CaughtSpeeding {
    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (speed <= 60 || (speed <= 65 && isBirthday) ){
            return 0;
        }

        if ( (speed > 60 && speed <= 80 && !isBirthday) || (speed > 65 && speed <= 85 && isBirthday) ){
            return 1;
        }

        if ( (speed > 80) && !isBirthday ){
            return 2;
        }

        return 1;
    }
}
