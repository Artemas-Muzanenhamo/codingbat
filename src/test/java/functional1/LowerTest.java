package functional1;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 31/07/2017.
 *
 * Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
 *
 * lower(["Hello", "Hi"]) → ["hello", "hi"]
 * lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
 * lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */
public class LowerTest {

    private Lower lower;

    List<String> actualString;
    List<String> expectedString;

    @Before
    public void init(){
        lower = new Lower();
    }

    @Test
    public void whenAStringInAListIsPassedThenReturnTheStringToLowerCase(){

        actualString = new ArrayList<>();
        actualString.add("HellO");

        expectedString = new ArrayList<>();
        expectedString.add("hello");

        assertEquals(expectedString, lower.lower(actualString));
    }

    @Test
    public void whenAListOfStringsIsPassedThenReturnAllTheStringsToLowerCase(){

        actualString = new ArrayList<>();
        actualString.add("Hello");
        actualString.add("Hi");
        actualString.add("AAA");
        actualString.add("BBB");
        actualString.add("CCC");

        expectedString = new ArrayList<>();
        expectedString.add("hello");
        expectedString.add("hi");
        expectedString.add("aaa");
        expectedString.add("bbb");
        expectedString.add("ccc");

        assertEquals(expectedString, lower.lower(actualString));

    }

}
