package vendor;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class VendingMachineTest {
	
	@Test
	public final void whenPenceIsPassedThenPoundValueIsShown() throws Exception{
		
		Collection<Integer> coinsInPounds = new ArrayList<Integer>();
		coinsInPounds.add(1);
		
		assertEquals(coinsInPounds, VendingMachine.getOptimalChangeFor(100));
		
	}
	
	@Test
	public final void whenPenceIs2UnitsThenCorrentPenceWillBeReturned(){
		
		
		
	}

}
