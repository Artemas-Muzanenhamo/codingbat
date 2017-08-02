package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Artemas on 23/06/2017.
 *
 * When squirrels get together for a party, they like to have cigars.
 *
 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
 *
 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 *
 * Return true if the party with the given values is successful, or false otherwise.
 *
 * cigarParty(30, false) → false
 * cigarParty(50, false) → true
 * cigarParty(70, true) → true
 */
public class CigarPartyTest {
    
    private CigarParty cigarParty;
    
    @Before
    public void init(){
        cigarParty = new CigarParty();
    }

    @Test
    public void whenNumberOfCigarsIsLessThan30AndItsAWeekendThenReturnFalse(){
        assertFalse(cigarParty.cigarParty(30, true));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThanOrEqualTo40AndItsAWeekendThenReturnTrue(){
        assertTrue(cigarParty.cigarParty(40, true));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThan60AndItsAWeekendThenReturnTrue(){
        assertTrue(cigarParty.cigarParty(100, true));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThanOrEqualTo40ThenReturnTrue(){
        assertTrue(cigarParty.cigarParty(40, false));
    }

    @Test
    public void whenNumberOfCigarsIsLessThanOrEqualTo60ThenReturnTrue(){
        assertTrue(cigarParty.cigarParty(60, false));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThan60ThenReturnFalse(){
        assertFalse(cigarParty.cigarParty(70, false));
    }
}