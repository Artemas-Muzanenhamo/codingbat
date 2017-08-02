package logic1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 06/07/2017.
 *
 * Return the sum of two 6-sided dice rolls, each in the range 1..6.
 *
 * However, if noDoubles is true, and
 * if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
 *
 * withoutDoubles(2, 3, true) → 5
 * withoutDoubles(3, 3, true) → 7
 * withoutDoubles(3, 3, false) → 6
 */
public class WithoutDoublesTest {
    
    private WithoutDoubles withoutDoubles;
    
    @Before
    public void init(){
        withoutDoubles = new WithoutDoubles();
    }

    @Test
    public void whenTheDiceRolledIsMadeUpOf2And3AndNoDoublesIsFalseThenReturn5(){
        assertEquals(5, withoutDoubles.withoutDoubles(2, 3, false));
    }

    @Test
    public void whenTheDiceRolledIsMadeUpOf3And3AndNoDoublesIsFalseThenReturn6(){
        assertEquals(6, withoutDoubles.withoutDoubles(3, 3, false));
    }

    @Test
    public void whenTheDiceRolledIsMadeUpOf3And3AndNoDoubleIsTrueThenReturn7(){
        assertEquals(7, withoutDoubles.withoutDoubles(3, 3, true));
    }

    @Test
    public void whenTheDiceRolledIsMadeUpOf2And3AndNoDoublesIsTrueThenReturn5(){
        assertEquals(5, withoutDoubles.withoutDoubles(2, 3, true));
    }

    @Test
    public void whenTheDiceRolledIsMadeUpOf6And6AndNoDoubleIsTrueThenReturn7(){
        assertEquals(7, withoutDoubles.withoutDoubles(6, 6, true));
    }
}
