package logic1;

/**
 * Created by Artemas on 28/06/2017.
 */
public class AnswerCell {
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        if ( (isMorning && !isMom) || (isAsleep) ){
            return false;
        }

        return true;
    }
}
