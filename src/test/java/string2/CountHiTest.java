package string2;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by artemasm on 26/07/2017.
 * Return the number of times that the string "hi" appears anywhere in the given string.
 *
 * countHi("abc hi ho") → 1
 * countHi("ABChi hi") → 2
 * countHi("hihi") → 2
 */
public class CountHiTest {

    @Test
    public void whenAStringContains_HI_ThenReturnCount1(){
        assertEquals(1, CountHi.countHi("hi"));
    }

    @Test
    public void whenAStringContains_HIHI_ThenReturnCount2(){
        assertEquals(2, CountHi.countHi("hihi"));
    }

    @Test
    public void whenAStringContains_HI_InMultplePlacesThenReturnCountOfHi(){
        assertEquals(1, CountHi.countHi("abc hi ho"));

        //lazy
        assertEquals(2, CountHi.countHi("ABChi hi"));
    }

}
