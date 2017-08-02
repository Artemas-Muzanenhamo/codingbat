package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by artemasm on 28/06/2017.#
 *
 * We are having a party with amounts of tea and candy.
 * Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
 *
 * A party is good (1) if both tea and candy are at least 5.
 *
 * However, if either tea or candy is at least double the amount of the other one, the party is great (2).
 *
 * However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
 *
 * teaParty(6, 8) → 1
 * teaParty(3, 8) → 0
 * teaParty(20, 6) → 2
 */
public class TeaPartyTest {
    
    private TeaParty teaParty;
    
    @Before
    public void init(){
        teaParty = new TeaParty();
    }

    @Test
    public void whenEitherTeaOrCandyAreBelow5ThenReturn0(){
        assertEquals(0, teaParty.teaParty(3, 8));
    }

    @Test
    public void whenCandyAndTeaAreGreaterThan5ThenReturn1(){
        assertEquals(1, teaParty.teaParty(5, 9));
    }

    @Test
    public void whenCandyIsDoubleTheAmountOfTeaThenReturn2(){
        assertEquals(2, teaParty.teaParty(5, 10));
    }
}
