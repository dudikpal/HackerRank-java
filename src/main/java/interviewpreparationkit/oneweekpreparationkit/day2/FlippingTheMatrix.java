package interviewpreparationkit.oneweekpreparationkit.day2;

import java.util.ArrayList;
import java.util.List;

public class FlippingTheMatrix {

	public static int flippingMatrix(List<List <Integer>> matrix) {
		// Write your code here
		List<Integer> columnsSum = new ArrayList <>();
		List<Integer> rowsSum = new ArrayList <>();

		for (int i = 0; i < matrix.size(); i++) {
			for (int j = 0; j < matrix.get(0).size(); j++) {
				rowsSum.set(i, rowsSum.get(i) + matrix.get(i).get(j));
				columnsSum.set(j, columnsSum.get(j) + matrix.get(i).get(j));
			}
		}

		System.out.println(columnsSum);
		System.out.println(rowsSum);

		return 0;
	}

	public static void main(String[] args) {



	}
}
