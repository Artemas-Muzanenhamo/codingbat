package warmup1;

public class Program2 {
	
	public static boolean loneTeen(int a, int b){
		
		//if (a || b are teen) return true
		//if (a && b are not teen) return false
		
		if ((a >=13 && a <=19 ) && (b >=13 && b <=19)){
			//13, 13
			//99, 99
			return false;
		}else if((a < 13 || a > 19) && (b < 13 || b > 19)){
			return false;
		}else{
			return true;
		}
	}

}
