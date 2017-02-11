package warmup1;

public class Program5 {
	
	public static String startOz(String str){
		
		String word = null;
		
		if (str.length() >= 2){
			word = str.substring(0, 2);
			
			if (word.contains("oz")){
				return word;
			}else if (word.substring(1, 2).equals("z")){
				return "z";
			}else if (word.indexOf("o") == 0){
				return "o";
			}
		}else if((!str.isEmpty()) && (str.substring(0,1).equals("o"))){
			return "o";
		}else if((!str.isEmpty()) && (str.substring(1,1).equals("z"))){
			return "z";
		}
		
		return "";
		
	}

}
