package week6.day1;

public class EmployeeInfo {
	
	int empId;
	String empName;
	static String companyName;
		
	public void setValues(int id, String name, String company) {
		empId = id;
		empName = name;
		companyName = company;
	}
	
	public void printValues() {
		System.out.println(empId+" "+empName+" "+companyName);
	}
	
	
	public static void getDetails() {
		System.out.println("I am a static method");

	}
	
	public static void main(String[] args) {
		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.setValues(100, "Hari", "TestLeaf");
		emp1.printValues();
		
		System.out.println("*******************************");
		
		EmployeeInfo emp2 = new EmployeeInfo();
		emp2.setValues(200, "Haja", "TestLeaf Software Solution");
		
		emp1.printValues();
		emp2.printValues();
		
		
		getDetails();
		

	}

}
