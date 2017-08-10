package warmup2;

import org.junit.Before;
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
    
    private CountXX countXX;
    
    @Before
    public void init(){
        countXX = new CountXX();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnZero(){

        assertEquals(0, countXX.countXX(""));

    }

    @Test
    public void whenGenericStringIsPassedThenReturnZero(){

        assertEquals(0, countXX.countXX("Hello"));

    }

    @Test
    public void whenStringXXIsPassedThenReturnOneOccurancesAsResult(){

        assertEquals(1, countXX.countXX("abcxx"));

    }

//    @Test
//    public void whenStringWithXXIsPassedThenReturnATrimmedStringWithASingleX(){
//        assertEquals("abcx", countXX.removeCharAt("abcxx", "abcxx".indexOf("xx")));
//    }

    @Test
    public void whenStringXXXIsPassedThenReturnTwoOccurancesAsResult(){

        assertEquals(2, countXX.countXX("xxx"));

    }

    @Test
    public void whenStringXXXXIsPassedThenReturnThreeOccurancesAsResult(){

        System.out.println(countXX.countXX("xxxx"));
        assertEquals(3, countXX.countXX("xxxx"));

    }
}
