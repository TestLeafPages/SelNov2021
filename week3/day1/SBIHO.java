package week3.day1;

public class SBIHO {
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);

	}
	
	public void savingsAccount() {
		System.out.println("5% interest");

	}
	
	public void fixedDeposit() {
		System.out.println("7% interest");

	}
	
	public static void main(String[] args) {
		
		SBIHO sbi = new SBIHO();
		sbi.savingsAccount();
		sbi.fixedDeposit();
	}

}
