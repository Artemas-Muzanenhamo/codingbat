package codingbat;

public class Program5 {
	
	public static String startOz(String str){
		
		String word = null;
		
			
		word = str.substring(0, 2);
		
		if (word.contains("oz")){
			return word;
		}else if (word.indexOf("z") == 1){
			return "z";
		}else if (word.indexOf("o") == 0){
			return "o";
		}
		
		return "";
		
	}

}
