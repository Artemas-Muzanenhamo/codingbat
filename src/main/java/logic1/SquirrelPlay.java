package logic1;

/**
 * Created by Artemas on 26/06/2017.
 */
public class SquirrelPlay {
    public boolean squirrelPlay(int temp, boolean isSummer) {

        if ( (temp >= 60 && temp <= 100) && isSummer){
            return true;
        }else if ( (temp >= 60 && temp <= 90) ){
            return true;
        }

        return false;

    }
}
