package codingbat;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Given three int values, a b c, return the largest.
//
//intMax(1, 2, 3) → 3
//intMax(1, 3, 2) → 3
//intMax(3, 2, 1) → 3

public class Program6Test {
	
//	@Test
//	public void whenAllNumbersAreTheSameThenReturnTheSameValue(){
//		
//		assertEquals(1, Program6.intMax(1, 1, 1));
//		
//	}
	
	@Test
	public void whenDifferentNumbersArePassedThenReturnBiggestValue(){
		
		assertEquals(3, Program6.intMax(3, 2, 1));
		
	}
	
	@Test
	public void when123IsPassedThenReturn3(){
		assertEquals(3, Program6.intMax(1, 2, 3));
	}

}
