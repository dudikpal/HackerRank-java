package interviewpreparationkit.oneweekpreparationkit.day4;

import java.util.Arrays;

public class RecursiveDigitSum {

	public static int superDigit(String n, int k) {
		// Write your code here
		long sum = 0;

		for (int i = 0; i < n.length(); i++) {
			sum += Integer.parseInt(String.valueOf(n.charAt(i)));
		}

		return getSuperDigit(String.valueOf(sum * k));
	}

	private static int getSuperDigit(String numberString) {

		while (numberString.length() > 1) {
			numberString = reduceToSuperDigitString(numberString);
		}

		return Integer.parseInt(numberString.toString());
	}

	private static String reduceToSuperDigitString(String numberString) {
		long sum = 0;

		for (int i = 0; i < numberString.length(); i++) {
			final int index = i;
			sum += Integer.parseInt(String.valueOf(numberString.charAt(index)));
		}

		return String.valueOf(sum);
	}
}
