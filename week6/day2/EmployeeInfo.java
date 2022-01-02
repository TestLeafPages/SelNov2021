package week6.day2;

public class EmployeeInfo {
	
	int empId;
	String empName;
	boolean empStatus;
	
	//default constructor
	EmployeeInfo(){
		this(200,"Prasad",false); // to call parameterized constructor call
		System.out.println("Default Contructor");
	}
	
	
	//parameterized constructor
	EmployeeInfo(int empId, String empName, boolean empStatus){
		//this(); // to call the default constructor
		System.out.println("Parameterized Constructor");
		this.empId = empId;
		this.empName = empName;
		this.empStatus = empStatus;
		
	}
	

	public static void main(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empStatus);
		
		
		

	}

}
