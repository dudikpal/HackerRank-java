package interviewpreparationkit.oneweekpreparationkit.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {

	public static int findMedian(List <Integer> arr) {
		// Write your code here
		Collections.sort(arr);

		if (arr.size() % 2 == 0) {
			return arr.get(arr.size() / 2 + 1);
		} else {
			return arr.get(arr.size() / 2);
		}
	}

	public static void main(String[] args) {

		System.out.println(findMedian(Arrays.asList(5, 3 , 1, 2, 4))); //3
		System.out.println(findMedian(Arrays.asList(0,1,2,4,6,5,3))); // 3
		System.out.println(findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3))); //3
	}
}
