package interviewpreparationkit.oneweekpreparationkit.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GridChallenge {

	public static String gridChallenge(List <String> grid) {
		// Write your code here
		List<String> orderedGrid = new ArrayList <>();

		for (String row : grid) {
			String[] arr = row.split("");
			Arrays.sort(arr);
			orderedGrid.add(Arrays.stream(arr).collect(Collectors.joining()));
		}

		return isColumnOrdered(orderedGrid) ? "YES" : "NO";
	}

	private static boolean isColumnOrdered(List<String> orderedGrid) {

		for (int i = 0; i < orderedGrid.get(0).length(); i++) {
			final int colIndex = i;
			String columnString = orderedGrid.stream()
					.map(row -> String.valueOf(row.charAt(colIndex)))
					.collect(Collectors.joining());
			String[] column = columnString.split("");
			Arrays.sort(column);
			String orderedColumnString = Arrays.stream(column).collect(Collectors.joining());

			if (!columnString.equals(orderedColumnString)) {
				return false;
			}
		}
		return true;
	}
}
