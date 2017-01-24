package artemas;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test(expected = RuntimeException.class)
	public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() throws Exception{
		
		StringCalculator.add("1,2,3");

	}
	
	@Test
	public final void when2NumbersAreUsedTheNoExceptionIsThrown(){
		
		StringCalculator.add("1,2");
		assertTrue(true);
		
	}
	
	@Test
	public final void when0IsPassedInThenReturnTheSameNumber(){
		
		assertEquals(0, StringCalculator.add(""));
		
	}
	
	@Test
	public final void whenOneNumberIsPassedInThenReturnTheSameNumber(){
		
		assertEquals(3, StringCalculator.add("3"));
		
	}
	
//	@Test
//	public final void whenNonNumberIsPassedInThenThrowException() throws Exception{
//		
//		System.out.println(StringCalculator.add("1,X"));
//		
//	}
}
