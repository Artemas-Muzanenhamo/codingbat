package codingbat;

import static org.junit.Assert.assertEquals;

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
	
	@Test(expected=NullPointerException.class)
	public void whenNullParameterisPassedInThenReturnNull() throws Exception{
		
		Program3.delDel(null);
		
	}
	
	@Test
	public void whenStringLengthIsLessThan3ThenReturnStringAsIs(){
		
		assertEquals("Hi", Program3.delDel("Hi"));
		assertEquals("add", Program3.delDel("add"));
		assertEquals("del", Program3.delDel("del"));
		
	}
	
	@Test
	public void whenStringDelAppearsAtIndex1ThenReturnAStringWhereThatDelIsDeleted(){
		
		String testWord1 = Program3.delDel("adelbc");
		String testWord2 = Program3.delDel("adelHello");
		
		assertEquals("abc", testWord1);
		assertEquals("aHello", testWord2);
		
	}
	
	@Test
	public void whenStringContainsNoDelThenReturnWordAsIs(){
		assertEquals("adedbc", Program3.delDel("adedbc"));
	}
	
	@Test
	public void whenStringStartsDelAtAnyIndexThan1ThenRetunWordAsIs(){
		assertEquals("abcdel", Program3.delDel("abcdel"));
	}

}
