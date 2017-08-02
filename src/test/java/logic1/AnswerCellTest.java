package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 28/06/2017.
 *
 * Your cell phone rings.
 *
 * Return true if you should answer it.
 *
 * Normally you answer,
 *
 * except in the morning you only answer if it is your mom calling.
 *
 * In all cases, if you are asleep, you do not answer.
 *
 * answerCell(false, false, false) → true
 * answerCell(false, false, true) → false
 * answerCell(true, false, false) → false
 */
public class AnswerCellTest {
    
    private AnswerCell answerCell;
    
    @Before
    public void init(){
        answerCell = new AnswerCell();
    }

    @Test
    public void whenNotMorningNotMomAndNotSleepingThenReturnTrue(){
        assertTrue(answerCell.answerCell(false, false, false));
    }

    @Test
    public void whenItsMorningAndNotMomAndNotAsleepThenReturnFalse(){
        assertFalse(answerCell.answerCell(true, false, false));
    }

    @Test
    public void whenItsMorningAndIsMomAndNotAsleepThenReturnTrue(){
        assertTrue(answerCell.answerCell(true, true, false));
    }

    @Test
    public void whenItsNotMorningNotMomAndAsleepThenReturnFalse(){
        assertFalse(answerCell.answerCell(false, false, true));
    }



}
