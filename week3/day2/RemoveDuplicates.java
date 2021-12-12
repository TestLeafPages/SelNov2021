package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String input = "PayPal India";// output -> PaylIndi
		
		char[] charArr = input.toCharArray();
		
		//use set to remove duplicates
		Set<Character> charSet = new LinkedHashSet<Character>();
				
		for (char ch : charArr) {
			charSet.add(ch);
		}
				
		/*
		 * for (int i = 0; i < input.length(); i++) {
		 * 
		 * charSet.add(input.charAt(i));
		 * 
		 * }
		 */
		
		for (Character eachChar : charSet) {
			if(eachChar!=' ')
			 System.out.print(eachChar);
			
		}
		

	}

}
