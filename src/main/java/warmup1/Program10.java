package warmup1;

public class Program10 {
	
	public static boolean stringE(String str){
		
		int count = 0;
		
		if (!str.isEmpty()){
			
			String[] array = str.split("");
			
			for(int i=0; i<array.length; i++){
				if (array[i].contains("e")){
					count++;
				}
			}
			
			if (count >= 1 && count < 4){
				return true;
			}
		}
		
		return false;
		
	}

}
