package week1.day1;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		char browser = 's'; 

		if (browser == 'c') {
			System.out.println("Open ChromeBrowser");
		}
		else if (browser == 'e') {
			System.out.println("Open EdgeBrowser");
		}

		else if (browser == 's') {
			System.out.println("Open SafariBrowser");
		} else{
			System.out.println("open default browser");
		}

		/*
		 * if (browser == 'c') { System.out.println("Open ChromeBrowser"); } else {
		 * System.out.println("Open EdgeBrowser"); }
		 */

		System.out.println("end of program");
	}

}
