package codingbat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program3 {
	
	public static String delDel(String str){
		
		//adelbc
		if(str.length() < 3){
			return str;
		}else if(str.contains("del")){
			
			StringBuilder subbedString = new StringBuilder(str);
			
			String newString = subbedString.delete(1, 4).toString();
			
			return newString;
			
		}else {
			return str;
		}
		
	}

}
