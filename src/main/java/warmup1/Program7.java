package warmup1;

public class Program7 {
	
	public int close10(int a, int b){
		
		a = Math.abs(a);
		b = Math.abs(b);
		
		int aDifference = 10 - a;
		int bDifference = 10 - b;
		
		aDifference = Math.abs(aDifference);
		bDifference = Math.abs(bDifference);
		
		if (aDifference == bDifference){
			return 0;
		}else if(bDifference < aDifference){
			return b;
		}else if(aDifference < bDifference){
			return a;
		}
		
		
		return 0;
	}

}
