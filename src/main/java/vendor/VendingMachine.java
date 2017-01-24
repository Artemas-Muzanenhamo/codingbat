package vendor;

import java.util.ArrayList;
import java.util.Collection;

public class VendingMachine {
	static String count67 = "Artemas";
	
	public static final Collection<Integer> getOptimalChangeFor(int pence){
		
		pence = pence/100;
		
		Collection<Integer> coinsInPounds = new ArrayList<Integer>();
		coinsInPounds.add(pence);
		return coinsInPounds;
		
	}
	

}
