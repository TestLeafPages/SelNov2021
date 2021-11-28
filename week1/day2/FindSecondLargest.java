package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,5,89,35,67,89,34,76};
		
		Arrays.sort(data); // 2,3,4,6,7,11
		
		int indexOfSecondLarget = data.length-2; 
		
		System.out.println(data[indexOfSecondLarget]);
		
		

	}

}
