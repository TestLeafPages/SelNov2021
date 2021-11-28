package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		int input = 5; // 5*4*3*2*1 = 120
		
		int result = 1; //multiplication intial value for the result
				
		for (int i = input; i >= 1; i--) { //5, 4,3
			
			result = result * i; //3 * 10 = 30
			
			
		}
		
		System.out.println(result);
		
		
		
		

	}

}
