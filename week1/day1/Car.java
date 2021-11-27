package week1.day1;

//type methodName cntrl+space and enter
//type syso cntrl+space

//type main cntrl+space and enter
//accessSpecifier keyword ClassName
public class Car {
	
	String brandName = "Honda"; 
	//int noOfWheels = 130;
	//long	ownerMobile = 8884151543;
	
	//accessSpecifier returnType methodName()
	public void applyBrake() {
		String brakeType = "ABS" ;
		System.out.println("applied brake");// to print in console
		System.out.println(brakeType);
		System.out.println(brandName);
		
	}
	
	public void soundHorn() {
		System.out.println("sound horn");
		System.out.println(brandName);
	
	}
	
	public static void main(String[] args) {
	//ClassName objectName = new ClassName()
	Car myCar = new Car();
	
	//objectName.methodName()
	myCar.applyBrake();
	myCar.soundHorn();
	
	System.out.println(myCar.brandName);
	
	
			
	}
	
	
	
	
	

}
