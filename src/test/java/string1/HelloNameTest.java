package string1;

import org.junit.Before;
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
    
    private HelloName helloName;
    
    @Before
    public void init(){
        helloName = new HelloName();
    }

    @Test
    public void whenEmptyStringIsPassedThenReturnHelloWithEmptyValue(){
        assertEquals("Hello!", helloName.helloName(""));
    }

    @Test
    public void whenStringIsPassedThenReturnHelloPlusTheStringWithExclamationMark(){
        assertEquals("Hello Artemas!", helloName.helloName("Artemas"));
    }
}
