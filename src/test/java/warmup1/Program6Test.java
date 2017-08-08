package warmup1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//Given three int values, a b c, return the largest.
//
//intMax(1, 2, 3) → 3
//intMax(1, 3, 2) → 3
//intMax(3, 2, 1) → 3

public class Program6Test {
    
    private Program6 program6;
    
    @Before
    public void init(){
        program6 = new Program6();
    }
	
//	@Test
//	public void whenAllNumbersAreTheSameThenReturnTheSameValue(){
//		
//		assertEquals(1, program6.intMax(1, 1, 1));
//		
//	}
	
	@Test
	public void whenDifferentNumbersArePassedThenReturnBiggestValue(){
		
		assertEquals(3, program6.intMax(3, 2, 1));
		
	}
	
	@Test
	public void when123IsPassedThenReturn3(){
		assertEquals(3, program6.intMax(1, 2, 3));
	}

}
