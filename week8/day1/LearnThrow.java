package week8.day1;

public class LearnThrow {
	
	//Business -> num1 < num2 -> Invalid input -> Throw an arthimetic
	
	public void divide(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1/num2);
		}
		else {
			throw new ArithmeticException("Invalid Input - input1 is smaller than input2");
		}

	}

	public static void main(String[] args) {
		LearnThrow lt = new LearnThrow();
		
		try {
			lt.divide(10, 20);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("End of program");

	}

}
