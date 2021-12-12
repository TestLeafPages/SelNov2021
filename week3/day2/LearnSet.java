package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;

public class LearnSet {

	/*
	 * Arrays -> 10 data (int) -> static int[] nums = new int[]; Dynamic arrays ->
	 * grow or shrink !!
	 * 
	 * Set - Interface - Implemented using several classes like HashSet, TreeSet,
	 * LinkedHashSet - Single Dimensional data structure
	 * 
	 * 1- Does not Duplicate data to be stored (Only Unique values allowed)
	 * 
	 * 2 - Order depends on the implementation class
	 * 
	 * - HashSet : It will use hashing algorithm !! -> Every input String --> Unique
	 * Hash value Random Order (quick way to assemble) - TreeSet : Order based on
	 * ASCII value (Ascending order) - LinkedHashSet : Like List, Order maintained
	 * in the insertion order
	 * 
	 * - Highly used Methods: - add : to add element to the set (depends on the
	 * implementation class) - remove - size - contains - Why no get method by index
	 * -> because of the way implementation class works
	 * 
	 * Companies -> TCS, Infosys, CapGemini HashSet -> Infosys, CapGemini, TCS
	 * (depends on hash value) TreeSet -> CapGemini, Infosys, TCS (depends on ASCII)
	 * LinkedHashSet -> TCS, Infosys, CapGemini (retain the order of insertion)
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// input
		// String[] values = {"TCS","Wipro","Infosys"}; //0,1,2

		Set<String> companies = new LinkedHashSet<String>();

		/*
		 * for(String temp: values) { companies.add(temp); }
		 * System.out.println(companies);
		 */
		
		  companies.add("TCS"); 
		  boolean added = companies.add("Amazon"); //true
		  System.out.println(added);
		  
		  companies.add("Infosys"); 
		  companies.add("Accenture");
		  companies.add("CapGemini"); 
		  boolean added1 = companies.add("Amazon"); //false
		  companies.add("tcs");
		  
		  
		  System.out.println(added1);
		  
		  System.out.println(companies);
		  
		 
		  
		  //copy Set into List 
		  List<String> listCompanies = new ArrayList<String>(companies);
		 
		  System.out.println(listCompanies);
		  
		 // System.out.println(listCompanies.get(2));
		  
		  
		 
		/*
		 * When to use Set in Selenium Switch Window -> Each window -> unique id -> Set
		 * 
		 * I wanted to check if the train numbers are unique
		 * 
		 * I get all the train numbers -> count -> add them to set -> count if both
		 * count matches -> everything is unique
		 * 
		 */

	}

}
