package interviewpreparationkit.oneweekpreparationkit.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MiniMaxSum {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList <>(
				List.of(140537896, 243908675, 670291834, 923018467, 520718469)
		);
		miniMaxSum(arr);
	}

	public static void miniMaxSum(List <Integer> arr) {
		// Write your code here
		Collections.sort(arr);
		long sum = (long)arr.get(0) + (long)arr.get(1) + (long)arr.get(2) + (long)arr.get(3) + (long)arr.get(4);
		long min = sum - arr.get(4);
		long max = sum - arr.get(0);
		System.out.print(min + " ");
		System.out.println(max);
	}
}