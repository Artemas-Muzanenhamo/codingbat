package codingbat;

public class Program6 {
	
	public static int intMax(int a, int b, int c){
		
		if (a > b && a > c){
			return a; //if first int is the biggest
		}else if (b > a && b > c){
			return b; //if second int is the biggest
		}else if (c > a && c > b){
			return c; //if third int is the biggest
		}else{
			return 0;
		}
		
	}

}
