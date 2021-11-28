package week1.day2;

public class MyCar {
	
	public void printCarPrice() {
		System.out.println("700000");

	}
	
	//Honda -> 1 ; Hyundai 2 -> need to give input
	
	public int getCarPrice(int carNumber, char fuelType) {
		int price = 0;
		if(carNumber == 1) {
			price = 700000;
		}else if(carNumber == 2) {
			price = 800000;
		}
		//System.out.println(price);
		
		return price;

	}
	
	public void driveCar() {
		System.out.println("drive car");

	}
	
	public static void main(String[] args) {
		
		MyCar mc = new MyCar();
		
		System.out.println(mc.getCarPrice(2,'D'));
		
		/*
		 * int value = mc.getCarPrice(2,'D'); System.out.println(value);
		 */
		
	}


}
