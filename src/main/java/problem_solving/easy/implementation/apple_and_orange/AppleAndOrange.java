package problem_solving.easy.implementation.apple_and_orange;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

	public static void countApplesAndOranges(int s, int t, int a, int b, List <Integer> apples, List<Integer> oranges) {
		// Write your code here
		int startHouse = s;
		int endHouse = t;
		int appleTree = a;
		int orangeTree = b;
		int counter = 0;
		List<Integer> result = new ArrayList <>();
		String res = "";

		for (int position : apples) {

			if ((appleTree + position) >= startHouse && (appleTree + position) <= endHouse) {
				counter++;
			}
		}
		result.add(counter);
		res += counter + "\n";
		counter = 0;

		for (int position : oranges) {

			if ((orangeTree + position) <= endHouse && (orangeTree + position) >= startHouse) {
				counter++;
			}
		}
		result.add(counter);
		res += counter;

		/*System.out.println(result.get(0) + "\r" + result.get());
		System.out.println(result.get(1));*/
		System.out.println(res);
	}

}
