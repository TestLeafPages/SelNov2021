package week3.day2;

public class AxisBankSingapore extends AxisHeadOffice implements SingBank{

	@Override
	public int offerLoanToSoftwareEngineers() {
		return 10000;
	}

	public void applyTax() {
		System.out.println("Tax applied");
	}

}
