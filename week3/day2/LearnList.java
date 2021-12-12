package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	
	/* Arrays 
	 * 
	 * Types: Static, Dynamic Array
	 * 
	 * int[] employeeIds = {2003, 2008, 2011};
	 * Length of the array --> 3 
	 * 
	 * Can I change the size later? Fixed !! You cannot resize
	 * I like to resize? Create a new array and store there !! 
	 * 
	 * Dynamic Arrays --> Collections !! 
	 * 
	 * Collection --> List / Set (Single Dimension)
	 * 			  --> Map (Two Dimension)
	 * 
	 * List 
	 * 	- Interface
	 * 	- Implemented using several classes like ArrayList, LinkedList
	 * 	- Single Dimensional data structure
	 * 	- Allows Duplicate data to be stored
	 *  - Order is maintained in the order of insertion (FIFO)
	 * 	- Highly used Methods:
	 * 			- add : to add element to the list (by default: at the end)
	 * 			- remove : delete the element from the list
	 * 			- get : to retrieve the element from specific index
	 * 			- size : count of elements in the list
	 * 			- contains : to find whether given element exist in the list
	 * 	- How to sort a list? Collections.sort(list)
	 */

	public static void main(String[] args) {
		
		//String[] mentors = new String[5];
		List<String> mentors = new ArrayList<String>();
		
		mentors.add("Hari");
		mentors.add("Divya");
		mentors.add("Vidhya");
		mentors.add("Princilla");
		mentors.add("Babu"); // method overloading
		mentors.add(1,"Babu"); // method overloading
		
		
		System.out.println(mentors.size());
		
		String mentorName = mentors.get(3);
		System.out.println(mentorName);
		
		mentors.remove("Babu");
		System.out.println(mentors);
		
		Collections.sort(mentors); // sort it ASCII 
		Collections.reverse(mentors);
		System.out.println(mentors);


	}

}















