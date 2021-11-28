package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		String browser = "edge";

		switch (browser) {
		case "chrome":
			System.out.println("open chrome browser");
			break;
		case "edge":
			System.out.println("edge browser");
			break;
		case "safari":
			System.out.println("safari browser");
			break;
		case "opera":
			System.out.println("opera browser");
			break;
		default:
			System.out.println("IE browser");

		}

	}

}
