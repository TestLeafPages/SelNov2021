package week1.day2;

//length() -> to the number of characters in a String
//equals() -> to match 2 String values
//equalsIgnoreCase() -> match the values ignoring the case sensitve
//charAt() -> to get single character using index

public class LearnStringMethods {

	public static void main(String[] args) {
		//String literal
		String str1 = "welcome"; //100 Case sensitive; index starts with 0
	//	String str2 = "Welcome"; //100
		
		//using new keyword
		//String str3 = new String("Welcome");
		
		int len = str1.length();
		System.out.println(len);
		
		//System.out.println(str1.charAt(0));
		//System.out.println(str1.charAt(len-1));
		
		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
			
		}
		
		
		
		/*
		 * System.out.println(str1.equals(str2));
		 * System.out.println(str1.equalsIgnoreCase(str2));
		 */
	//	System.out.println(str2.compareTo(str1));
		
		
		

	}

}
