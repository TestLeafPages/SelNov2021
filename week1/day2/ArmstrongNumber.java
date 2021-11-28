package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 553; //(1*1*1)+(5*5*5)+(3*3*3) = 153
		
		int orgNum = input;
		
		int sum = 0;
		
		while(input > 0) {
		
			int rem = input % 10 ;  //123 % 10 -> 3
				//0 + 3 = 3
			sum = sum + (rem*rem*rem);
			
			//123 -> 12
			input = input / 10; // 123 / 10 -> 12
					
		}

		if(orgNum == sum) {
			System.out.println("given number is an armstrong number");	
		}else {
			System.out.println("given number is not an armstrong number");
		}
		
		
		
	}

}
