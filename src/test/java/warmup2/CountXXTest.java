package warmup2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 12/02/2017.
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 *
 */
public class CountXXTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnZero(){

        assertEquals(0, CountXX.countXX(""));

    }

    @Test
    public void whenGenericStringIsPassedThenReturnZero(){

        assertEquals(0, CountXX.countXX("Hello"));

    }

    @Test
    public void whenStringXXIsPassedThenReturnOneOccurancesAsResult(){

        assertEquals(1, CountXX.countXX("abcxx"));

    }

//    @Test
//    public void whenStringWithXXIsPassedThenReturnATrimmedStringWithASingleX(){
//        assertEquals("abcx", CountXX.removeCharAt("abcxx", "abcxx".indexOf("xx")));
//    }

    @Test
    public void whenStringXXXIsPassedThenReturnTwoOccurancesAsResult(){

        assertEquals(2, CountXX.countXX("xxx"));

    }

    @Test
    public void whenStringXXXXIsPassedThenReturnThreeOccurancesAsResult(){

        System.out.println(CountXX.countXX("xxxx"));
        assertEquals(3, CountXX.countXX("xxxx"));

    }
}
