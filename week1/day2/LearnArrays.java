package week1.day2;

import java.util.Arrays;

//length -> property to find the number of data in an array

public class LearnArrays {

	public static void main(String[] args) {
		int[] nums = {10,20,30,50,25}; //size is fixed as 5
				
		/*
		 * int[] nums = new int[3]; //size of the array is fixed; size has to be given
		 * at the time of declaration
		 * 
		 * nums[0] = 20; nums[1] = 10; nums[2] = 30;
		 */
		
		//to sort the data in ASCII order (ascending)
		Arrays.sort(nums);
		
		int len = nums.length;	
		
		for (int i = len-1; i >= 0; i--) {
			System.out.println(nums[i]);
			
		}
		
			
		//All the data are saved as index based
		//Index starts with 0
		//last index is length-1
		//int[] nums = {10,20,30,50,25};//0,1,2,3,4
		
		
		//System.out.println(nums[0]);
		/*
		 * int len = nums.length; //5 System.out.println(nums[len-1]); //length - 1
		 * 
		 * for(int i=0; i < len ; i++) { //0,1,2,3,4
		 * 
		 * System.out.println(nums[i]); }
		 */
		
		
		
		//to find the number of data in array
		
		//System.out.println(nums.length);
		
		//to get single data from array
		//System.out.println(nums[2]);
		
		//want to get last item from the array
		//System.out.println(nums[nums.length-1]);
		
		/*
		 * for (int i = 0; i < nums.length ; i++) {
		 * 
		 * System.out.println(nums[i]);
		 * 
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
