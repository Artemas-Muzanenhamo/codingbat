package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 03/04/2017.
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 *
 * altPairs("kitten") → "kien"
 * altPairs("Chocolate") → "Chole"
 * altPairs("CodingHorror") → "Congrr"
 */
public class AltPairsTest {

    @Test
    public void whenStringIsEmptyThenReturnEmptyString(){

        assertEquals("", AltPairs.altPairs(""));

    }

    @Test
    public void whenStringWithASingleCharacterIsPassedThenReturnTheStringAsIs(){

        assertEquals("A", AltPairs.altPairs("A"));

    }

    @Test
    public void whenStringPassedHas2CharactersThenReturnStringAsIs(){

        assertEquals("Ar", AltPairs.altPairs("Ar"));

    }

    @Test
    public void whenStringPassedHas3CharactersThenReturnFirstTwoStringsAsIs(){

        assertEquals("Ar", AltPairs.altPairs("Art"));

    }

    @Test
    public void whenStringPassedHas6CharactersThenReturn0145(){

        assertEquals("Arma", AltPairs.altPairs("Artemas"));

    }

    @Test
    public void whenStringPassedHas12CharactersThenReturnIndex014589Values(){

        assertEquals("Congrr", AltPairs.altPairs("CodingHorror"));
        assertEquals("Chole", AltPairs.altPairs("Chocolate"));
        assertEquals("ThThThth", AltPairs.altPairs("ThisThatTheOther"));

    }
}
