package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		String input = "Hari Prasad";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); // empty map
		char[] charArray = input.toCharArray();
		for (char ch : charArray) { // H
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
	}
		System.out.println(map);
	}

}
