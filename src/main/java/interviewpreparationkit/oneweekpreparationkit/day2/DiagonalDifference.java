package interviewpreparationkit.oneweekpreparationkit.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalDifference {

	public static int diagonalDifference(List<List <Integer>> arr) {
		// Write your code here
		int diagonal1 = 0;
		int diagonal2 = 0;

		for (int i = 0; i < arr.size(); i++) {
			diagonal1 += arr.get(i).get(i);
			diagonal2 += arr.get(i).get(arr.size() - 1 - i);
		}

		return Math.abs(diagonal1 - diagonal2);
	}

	public static void main(String[] args) {

		List<List<Integer>> matrix =List.of(
				List.of(1, 2, 3),
				List.of(4, 5, 6),
				List.of(9, 8, 9)
		);
		System.out.println(diagonalDifference(matrix));
	}
}
