package week3.day2;

public abstract class AxisHeadOffice implements RBI {
	
	// can create constructor !! 
	public AxisHeadOffice() {
		
	}

	public double minInterest() {
		return 5.5;
	}

	// implementation
	public int maxWithdrawal() {
		return 100000;
	}
	
	//  design
	public abstract int offerLoanToSoftwareEngineers();

}
