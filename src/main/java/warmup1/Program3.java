package warmup1;

public class Program3 {
	
	public String delDel(String str){
		
		//adelbc
		if(str.length() < 4){
			return str;
		}else if(str.substring(1, 4).equals("del")){
			
			StringBuilder subbedString = new StringBuilder(str);
			
			String newString = subbedString.delete(1, 4).toString();
			
			return newString;
			
		}else {
			return str;
		}
		
	}

}
