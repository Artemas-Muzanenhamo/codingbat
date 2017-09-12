package string1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by amuzanenhamo on 05/05/2017.
 *
 * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
 *
 * except its first char does not need to match exactly.
 *
 * On a match, return the front of the string, or otherwise return the empty string.
 *
 * So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
 *
 * startWord("hippo", "hi") → "hi"
 * startWord("hippo", "xip") → "hip"
 * startWord("hippo", "i") → "h"
 */
public class StartWordTest {

    private StartWord startWord;

    @Before
    public void init(){
        startWord = new StartWord();
    }

    @Test
    public void whenAnEmptyStringAndAnEmptyWordArePassedThenReturnNothing(){
        assertEquals("", startWord.startWord("", ""));
    }

    @Test
    public void whenAWordIsLength1ThenReturnTheStringFirstChar(){
        assertEquals("h", startWord.startWord("hippo", "i"));
    }

    @Test
    public void whenAWordPassedHasMatchingCharsInTheStringThenReturnAStringMadeOfBoth(){
        assertEquals("hip", startWord.startWord("hippo", "xip"));
    }

}
