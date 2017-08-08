package warmup1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 * delDel("adelbc") → "abc"
 * delDel("adelHello") → "aHello"
 * delDel("adedbc") → "adedbc"
 * 
 * @author amuzanenhamo
 *
 */

public class Program3Test {

    private Program3 program3;
    
    @Before
    public void init(){
        program3 = new Program3();
    }
	
	@Test(expected=NullPointerException.class)
	public void whenNullParameterisPassedInThenReturnNull() throws Exception{
		
		program3.delDel(null);
		
	}
	
	@Test
	public void whenStringLengthIsLessThan3ThenReturnStringAsIs(){
		
		assertEquals("Hi", program3.delDel("Hi"));
		assertEquals("add", program3.delDel("add"));
		assertEquals("del", program3.delDel("del"));
		
	}
	
	@Test
	public void whenStringDelAppearsAtIndex1ThenReturnAStringWhereThatDelIsDeleted(){
		
		String testWord1 = program3.delDel("adelbc");
		String testWord2 = program3.delDel("adelHello");
		
		assertEquals("abc", testWord1);
		assertEquals("aHello", testWord2);
		
	}
	
	@Test
	public void whenStringContainsNoDelThenReturnWordAsIs(){
		assertEquals("adedbc", program3.delDel("adedbc"));
	}
	
	@Test
	public void whenStringStartsDelAtAnyIndexThan1ThenRetunWordAsIs(){
		assertEquals("abcdel", program3.delDel("abcdel"));
	}

}
