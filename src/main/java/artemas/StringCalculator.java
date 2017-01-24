package artemas;

public class StringCalculator {
	
	public static final int add(String numbers){
		
		String[] arr = numbers.split(",");
		
		if (arr.length > 2){
			throw new RuntimeException();
		}
		return 0;
		
	}

}
