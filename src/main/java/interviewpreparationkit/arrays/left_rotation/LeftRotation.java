package interviewpreparationkit.arrays.left_rotation;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

	public static List <Integer> rotLeft(List<Integer> a, int d) {

		List<Integer> resultArray = new ArrayList <>(a.subList(d, a.size()));
		resultArray.addAll(a.subList(0, d));

		return resultArray;
	}
}
