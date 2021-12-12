package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map -> 2D Collection
 *     -> HashMap, LinkedHashMap, TreeMap
 * HashMap -> Random order
 * LinkedHashMap -> Maintains the insertion order
 * TreeMap -> Ascii order
 * 
 *     -> Not allow duplicate Key, if there is duplicate key, it will overwrite the old value with new value
 *     
 * put() -> used to insert data into Map
 * get() -> pass the key and get value
 * containsKey() -> used to find the Key exist in the map or not
 * containsValue() -> used to find the value exist in the map or not
 * 
 */

public class LearnMap {

	public static void main(String[] args) {
		//key & value
		Map<Integer,String> mentors = new LinkedHashMap<Integer,String>();
		
		mentors.put(100, "Babu"); // 100 Babu
		mentors.put(200, "Hari"); // 200 Aravind
		mentors.put(400, "Vidhya");
		mentors.put(300, "Dhivya");
		mentors.put(500, "Princilla");
		mentors.put(200, "Aravind");
		
		/*
		 * System.out.println(mentors.get(200));
		 * System.out.println(mentors.containsKey(300));
		 * System.out.println(mentors.containsValue("Dhivya"));
		 */
		
		Set<Entry<Integer, String>> entrySet = mentors.entrySet();
		
		for (Entry<Integer, String> eachEntry : entrySet) {
			//System.out.println(eachEntry);
			System.out.print(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
