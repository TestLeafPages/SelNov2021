package week1.day2;

public class Calculator {
	
	public double add(int num1, double num2) {
				
		return num1+num2;
	}
	
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		double res = calc.add(20, 30.35);
		
	}

}
