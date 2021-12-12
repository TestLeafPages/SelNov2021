package week3.day2;

public class MyBank {
	
	

	public static void main(String[] args) {
		
		// RBI myBank = new RBI();   --> Interface cannot create object
		// AxisHeadOffice myBank = new AxisHeadOffice(); --> Abstract class cannot create object
		AxisNanganallur myBank = new AxisNanganallur();
		myBank.maxWithdrawal(); // from the abstract class
		myBank.offerLoanToSoftwareEngineers(); // from the concrete class 
	}

}
