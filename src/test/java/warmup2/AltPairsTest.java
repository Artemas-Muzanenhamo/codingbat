package warmup2;

import org.junit.Before;
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
    
    private AltPairs altPairs;
    
    @Before
    public void init(){
        altPairs = new AltPairs();
    }

    @Test
    public void whenStringIsEmptyThenReturnEmptyString(){

        assertEquals("", altPairs.altPairs(""));

    }

    @Test
    public void whenStringWithASingleCharacterIsPassedThenReturnTheStringAsIs(){

        assertEquals("A", altPairs.altPairs("A"));

    }

    @Test
    public void whenStringPassedHas2CharactersThenReturnStringAsIs(){

        assertEquals("Ar", altPairs.altPairs("Ar"));

    }

    @Test
    public void whenStringPassedHas3CharactersThenReturnFirstTwoStringsAsIs(){

        assertEquals("Ar", altPairs.altPairs("Art"));

    }

    @Test
    public void whenStringPassedHas6CharactersThenReturn0145(){

        assertEquals("Arma", altPairs.altPairs("Artemas"));

    }

    @Test
    public void whenStringPassedHas12CharactersThenReturnIndex014589Values(){

        assertEquals("Congrr", altPairs.altPairs("CodingHorror"));
        assertEquals("Chole", altPairs.altPairs("Chocolate"));
        assertEquals("ThThThth", altPairs.altPairs("ThisThatTheOther"));

    }
}
