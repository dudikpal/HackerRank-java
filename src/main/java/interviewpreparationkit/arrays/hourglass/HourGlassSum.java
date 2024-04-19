package interviewpreparationkit.arrays.hourglass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HourGlassSum {

	public static int hourglassSum(List<List <Integer>> arr) {
		int matrixDimension = 6;
		int hourglassDimension = 3;
		List<Integer> hourGlassSums = new ArrayList <>();

		for (int i = 0; i < matrixDimension - hourglassDimension + 1; i++) {

			for (int j = 0; j < matrixDimension - hourglassDimension + 1; j++) {

				hourGlassSums.add(getHourGlassSum(List.of(
						arr.get(i).subList(j, j + hourglassDimension),
						List.of(arr.get(i + 1).get(j + 1)),
						arr.get(i + 2).subList(j, j + hourglassDimension)
				)));
			}
		}

		return Collections.max(hourGlassSums);
	}

	private static int getHourGlassSum(List<List<Integer>> hourGlass) {

		int sum = 0;

		for (int i = 0; i < hourGlass.size(); i++) {

			if (i != hourGlass.size() / 2) {
				sum += hourGlass.get(i).stream().collect(Collectors.summingInt(number -> number.intValue()));
			} else {
				sum += hourGlass.get(i).get(0);
			}
		}

		return sum;
	}
}
