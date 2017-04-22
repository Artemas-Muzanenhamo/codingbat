package string1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amuzanenhamo on 22/04/2017.
 *
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
 *
 * helloName("Bob") → "Hello Bob!"
 * helloName("Alice") → "Hello Alice!"
 * helloName("X") → "Hello X!"
 */
public class HelloNameTest {

    @Test
    public void whenEmptyStringIsPassedThenReturnHelloWithEmptyValue(){
        assertEquals("Hello!", HelloName.helloName(""));
    }

    @Test
    public void whenStringIsPassedThenReturnHelloPlusTheStringWithExclamationMark(){
        assertEquals("Hello Artemas!", HelloName.helloName("Artemas"));
    }
}
