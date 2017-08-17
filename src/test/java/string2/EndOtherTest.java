package string2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 17/08/2017.
 *
 * Given two strings, return true if either of the strings appears at the very end of the other string,
 * ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 * Note: str.toLowerCase() returns the lowercase version of a string.
 *
 * endOther("Hiabc", "abc") → true
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */
public class EndOtherTest {

    private EndOther endOther;

    @Before
    public void init(){
        endOther = new EndOther();
    }

    @Test
    public void whenTheLeftStringPassedAppearsAtTheEndOfTheRightStringThenReturnTrue(){
        assertTrue(endOther.endOther("abc", "Hiabc"));
    }

    @Test
    public void whenTheRightStringPassedAppearsAtTheEndOfTheLeftStringThenReturnTrue(){
        assertTrue(endOther.endOther("Hiabc", "abc"));
    }

    @Test
    public void whenTheLeftStringPassedWithCapitalsAppearsAtTheEndOfTheRightStringThenReturnTrue(){
        assertTrue(endOther.endOther("Hiabc", "ABC"));
    }

    @Test
    public void whenTheStringsPassedDoNotAppearInAnyOfTheOtherStringsThenReturnFalse(){
        assertFalse(endOther.endOther("Hiabc", "xyz"));

        // lazy
        assertFalse(endOther.endOther("Hiabc", "XYZ"));
    }
}
