package logic1;

/**
 * Created by Artemas on 06/07/2017.
 */
public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if ( noDoubles && die1 == 6 && die2 == 6 && die1 == die2 ) {
            return die1 + 1;
        }else if ( (noDoubles) && (die1 != 6 && die2 != 6) && (die1 == die2) ){
            return (die1 + die2) + 1;
        }else {
            return die1 + die2;
        }
    }
}
