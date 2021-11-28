package week1.day2;

public class LearnBreak {

	public static void main(String[] args) {
		
		//3 -> Three
		
		for (int i = 1; i <= 5; i++) {
			
			if(i == 3) {
				System.out.println("Three");
				break;
			}
			
			System.out.println(i);
		}
		
		
		System.out.println("out of for loop");

	}

}
