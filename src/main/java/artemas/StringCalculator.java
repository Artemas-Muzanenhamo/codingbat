package artemas;

public class StringCalculator {
	
	public static final int add(String numbers){
		
		int number = 0;
		
		String[] arr = numbers.split(",");
		
		if (arr.length > 2){
			throw new RuntimeException();
		}
		
		if (!numbers.isEmpty() && numbers.length() < 2){
			number = Integer.parseInt(numbers);
		}
		
		return number;
		
	}

}
