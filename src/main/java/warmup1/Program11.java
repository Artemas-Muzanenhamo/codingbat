package warmup1;

public class Program11 {
	
	public String everyNth(String str, int n){
		
		String result = "";
		
		if (!str.isEmpty() && n >= 1){
			if(str.length() < n){
				return str.substring(0, 1);
			}else{
				// Look at every nth char
				for (int i=0; i<str.length(); i = i + n) {
					result = result + str.charAt(i);
				}
				
				return result;
			}
		}else{
			return str;
		}
	}
	
}
