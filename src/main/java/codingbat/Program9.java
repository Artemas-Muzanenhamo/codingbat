package codingbat;

public class Program9 {
	
	public static int max1020(int a, int b){
		
		a = Math.abs(a);
		b = Math.abs(b);
		
		if ((a >= 10 && a < 21) && (b >= 10 && b <21)){ //if both passed values are in range of 10...20 inclusive
			if (a > b){
				return a; //return a if it's the bigger value
			}else{
				return b; //return b if it's the bigger value
			}
		}
		
		if ((a >= 10 && a < 21)){ // if only a is in range of 10...20 inclusive
			return a; //return the value
		}
		
		if ((b >= 10 && b < 21)){ // if only b is in range of 10...20 inclusive
			return b; //return the value
		}
		
		return 0;
		
	}

}
