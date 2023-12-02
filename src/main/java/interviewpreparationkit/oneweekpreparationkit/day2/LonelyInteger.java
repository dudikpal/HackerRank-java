package interviewpreparationkit.oneweekpreparationkit.day2;

import java.util.*;

public class LonelyInteger {

	public static int lonelyinteger(List <Integer> a) {
		// Write your code here
		Map <Integer, Integer> result = new HashMap <>();

			for (Integer number : a) {
				if (!result.containsKey(number)) {
					result.put(number, 0);
				}
				result.put(number, result.get(number) + 1);
			}

		return result.entrySet().stream()
				.filter(entry -> entry.getValue() == 1)
				.mapToInt(entry -> entry.getKey())
				.findFirst()
				.getAsInt();
	}

	public static void main(String[] args) {

		List<Integer> arr = List.of(1, 2, 3 ,4, 3, 2, 1);
		System.out.println(lonelyinteger(arr)); 	//exp: 4
		List<Integer> arr1 = List.of(0, 0, 1, 2, 1);
		System.out.println(lonelyinteger(arr1));	// exp: 2
	}
}
