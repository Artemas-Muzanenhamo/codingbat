package logic1;

/**
 * Created by Artemas on 23/06/2017.
 */
public class DateFashion {
    public int dateFashion(int you, int date) {

        if ( (you > 7 && date > 7) || (you > 7 && date > 2) || (you > 2 && date > 7) ) {
            return 2;
        }

        if ( (you > 2 && you < 8) && (date > 2 && date < 8) ){
            return 1;
        }

        return 0;
    }
}
