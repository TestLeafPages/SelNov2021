package week8.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		int x = 10;

		int y = 5;

		int[] nums = { 10, 20, 30 }; // indices 0,1,2

		// Want to handle only Arithmetic Exception only
		// Don't want to handle other exception

		try {
			System.out.println(x / y);

			try {
				System.out.println(nums[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (ArithmeticException e) {
			if (y == 0) {
				System.out.println(x / 1);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("End of Program");

	}

}
