package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 07/07/2017.
 *
 * Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
 *
 * (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
 *
 * shareDigit(12, 23) → true
 * shareDigit(12, 43) → false
 * shareDigit(12, 44) → false
 */
public class ShareDigitTest {
    
    private ShareDigit shareDigit;
    
    @Before
    public void init(){
        shareDigit = new ShareDigit();
    }

    @Test
    public void whenValuesPassedInHaveNumbersThatAppearInBothValuesTheReturnTrue(){
        assertTrue(shareDigit.shareDigit(12, 23));
    }

    @Test
    public void whenValuesPassedInDoNotHaveNumbersThatAppearInBothValuesTheReturnFalse(){
        assertFalse(shareDigit.shareDigit(12, 44));
    }
}
