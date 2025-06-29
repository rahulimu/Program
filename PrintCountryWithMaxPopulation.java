package interview.misc_programs_2025;

import java.util.HashMap;
import java.util.*;

public class PrintCountryWithMaxPopulation {

	public static void main(String[] args) {
		Map<String, Long> countryPopulation = new HashMap<>();
		countryPopulation.put("China", 1410000000L);
		countryPopulation.put("India", 1400000000L);
		countryPopulation.put("United States", 334000000L);
		countryPopulation.put("Indonesia", 277000000L);
		countryPopulation.put("Pakistan", 240000000L);

		String highestCountry = "";
		long maxPopulation = 0;

		for (Map.Entry<String, Long> entry : countryPopulation.entrySet()) {
			if (entry.getValue() > maxPopulation) {
				maxPopulation = entry.getValue();
				highestCountry = entry.getKey();
			}
		}

		System.out.println("Country with highest population: " + highestCountry);
		System.out.println("Population: " + maxPopulation);
	}
}
