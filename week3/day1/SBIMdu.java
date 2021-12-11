package week3.day1;

public class SBIMdu extends SBIHO {
	
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	
	public void savingsAccount() {
		System.out.println("8% interest");

	}
	
	public void fixedDeposit() {
		System.out.println("10% interest");

	}
	public static void main(String[] args) {
		
		SBIMdu sm = new SBIMdu();
		
		//SBIHO sm = new SBIHO();
		
		sm.savingsAccount();
		sm.fixedDeposit();
		
		sm.add(10, 20, 30);
		
	}

}
