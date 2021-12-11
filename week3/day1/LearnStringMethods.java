package week3.day1;

//length() -> to the number of characters in a String
//equals() -> to match 2 String values
//equalsIgnoreCase() -> match the values ignoring the case sensitve
//charAt() -> to get single character using index
//replace() -> to replace old character into new character
//replaceAll() -> replace using regex
//subString() -> to get partial string
//split() -> to split string based on regex
public class LearnStringMethods {

	public static void main(String[] args) {
		
		String str = "Chennai - 600128";
		
		String replaceAll = str.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
		String replaceAll2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll2);
		
		
		String str1 = "Welcome";
		String str2 = "come";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.contains(str2));
		
		
		
		
		
		
		
		//String literal
		
		/*
		 * String str1 = "Welcome to java session"; //100 Case sensitive; index starts
		 * with 0
		 * 
		 * String[] words = str1.split(" ");
		 * 
		 * 
		 * for (int i = words.length-1; i >= 0; i--) {
		 * 
		 * System.out.println(words[i]);
		 * 
		 * }
		 */
		
		
		//String newStr = str1.substring(3, 6);// starts at 3, stops at 6-1(5)
		
		/* String newStr = str1.substring(3); */
	//	System.out.println(newStr);
		
		
		
		/*
		 * String newStr = str1.replaceAll("[^a-zA-Z]", "");
		 * 
		 * System.out.println(newStr);
		 */
		
		
		
	//	String str2 = "Welcome"; //100
		
		
				
		//using new keyword
		//String str3 = new String("Welcome");
		
		/*
		 * int len = str1.length(); System.out.println(len);
		 */
		
		//System.out.println(str1.charAt(0));
		//System.out.println(str1.charAt(len-1));
		/*
		 * for (int i = 0; i < str1.length(); i++) { System.out.println(str1.charAt(i));
		 * 
		 * }
		 */
		
		
		
		/*
		 * System.out.println(str1.equals(str2));
		 * System.out.println(str1.equalsIgnoreCase(str2));
		 */
	//	System.out.println(str2.compareTo(str1));
		
		
		

	}

}
