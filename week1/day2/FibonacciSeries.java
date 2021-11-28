package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//output : 0,1,1,2,3,5,8,13
		int num1 = 0; 
		int num2 = 1;
		
		int sum; //initial value as 0
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i = 1; i <= 98; i++) {
			
			sum = num1 + num2;
			System.out.println(sum);
			
			num1 = num2;
			num2 = sum;
			
			
		}

	}

}
