package logic1;

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

    @Test
    public void whenNumberOfCigarsIsLessThan30AndItsAWeekendThenReturnFalse(){
        assertFalse(CigarParty.cigarParty(30, true));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThanOrEqualTo40AndItsAWeekendThenReturnTrue(){
        assertTrue(CigarParty.cigarParty(40, true));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThan60AndItsAWeekendThenReturnTrue(){
        assertTrue(CigarParty.cigarParty(100, true));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThanOrEqualTo40ThenReturnTrue(){
        assertTrue(CigarParty.cigarParty(40, false));
    }

    @Test
    public void whenNumberOfCigarsIsLessThanOrEqualTo60ThenReturnTrue(){
        assertTrue(CigarParty.cigarParty(60, false));
    }

    @Test
    public void whenNumberOfCigarsIsMoreThan60ThenReturnFalse(){
        assertFalse(CigarParty.cigarParty(70, false));
    }
}