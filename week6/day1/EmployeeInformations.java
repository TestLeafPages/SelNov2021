package week6.day1;

public class EmployeeInformations {
	
	static {
		System.out.println("I am static block");
	}
	
	
	public static void main(String[] args) {
		
		
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.setValues(100, "Hari", "TestLeaf");
		
		//ClassName.staticMethod();
		EmployeeInfo.getDetails();
		
	}

}
