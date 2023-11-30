package interviewpreparationkit.oneweekpreparationkit.day1;

import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		List<Integer> arr = List.of(1, 1, 0, -1, -1);
		plusMinus(arr);
	}

	public static void plusMinus(List <Integer> arr) {
		// Write your code here
		double pos = 0;
		double neg = 0;
		double zeros = 0;

		for (int number : arr) {
			if (number > 0) {
				pos++;
			} else if (number == 0) {
				zeros++;
			} else {
				neg++;
			}
		}
		System.out.println(String.format("%.6f", pos / arr.size()));
		System.out.println(String.format("%.6f", neg / arr.size()));
		System.out.println(String.format("%.6f", zeros / arr.size()));
	}
}
