package interview.misc_programs_2025;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepetitiveCharacter {

	public static void main(String[] args) {
		String str = "my name is Rishav";
		String str1 = str.toLowerCase().replace(" ", "");

		Map<Character, Integer> count = new LinkedHashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			if (count.containsKey(str1.charAt(i))) {
				count.put(str1.charAt(i), count.get(str1.charAt(i)) + 1);
			} else {
				count.put(str1.charAt(i), 1);
			}
		}
		for(Map.Entry<Character,Integer> mapElement:count.entrySet())
		{
			if(mapElement.getValue()==1)
			{
				System.out.println(mapElement.getKey());
				break;
			}
		}

	}
}