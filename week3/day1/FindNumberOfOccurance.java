package week3.day1;

public class FindNumberOfOccurance {

	public static void main(String[] args) {
		String str  = "Welcome"; //want to count the occurance e -> 2
		
		String strWithoutE = str.replaceAll("e", "");
		
		System.out.println(strWithoutE);
		
		//7				//5
		int noOfOccurance = (str.length() - strWithoutE.length());
		System.out.println(noOfOccurance);

	}

}
