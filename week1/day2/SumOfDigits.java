package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 123; //1+2+3 = 6
		
		int sum = 0;
		
		while(input > 0) {
		
			int rem = input % 10 ;  //123 % 10 -> 3
				//0 + 3 = 3
			sum = sum + rem;
			
			//123 -> 12
			input = input / 10; // 123 / 10 -> 12
					
		}

		System.out.println(sum);
		
		
	}

}
