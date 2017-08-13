package logic1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by artemasm on 27/06/2017.
 *
 * Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
 *
 * Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
 *
 * nearTen(12) → true
 * nearTen(17) → false
 * nearTen(19) → true
 */
public class NearTenTest {
    
    private NearTen nearTen;
    
    @Before
    public void init(){
        nearTen = new NearTen();
    }

    @Test
    public void whenTheNumberPassedInIs2MoreOfAMultipleOf10ThenReturnTrue(){
        assertTrue(nearTen.nearTen(12));
    }

    @Test
    public void whenTheNumberPassedInIs2LessOfAMultipleOf10ThenReturnTrue(){
        assertTrue(nearTen.nearTen(18));
    }

    @Test
    public void whenTheNumberPassedInIs1MoreOfAMultipleOf10ThenReturnTrue(){
        assertTrue(nearTen.nearTen(11));
    }

    @Test
    public void whenTheNumberPassedInIs1LessOfAMultipleOf10ThenReturnTrue(){
        assertTrue(nearTen.nearTen(19));
    }

    @Test
    public void whenTheNumberPassedInIsAMultipleOf10ThenReturnTrue(){
        assertTrue(nearTen.nearTen(20));
    }

    @Test
    public void whenTheNumberPassedInIs3MoreThanATheMultipleOf10ThenReturnFalse(){
        assertFalse(nearTen.nearTen(13));
    }
}
