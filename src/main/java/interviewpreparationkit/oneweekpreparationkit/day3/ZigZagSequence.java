package interviewpreparationkit.oneweekpreparationkit.day3;

import java.util.Arrays;

public class ZigZagSequence {

	public static void findZigZagSequence(int [] a, int n){
		Arrays.sort(a);
		int mid = (n)/2;
		int temp = a[mid];
		a[mid] = a[n - 1];
		a[n - 1] = temp;

		int st = mid + 1;
		int ed = n - 2;
		while(st <= ed){
			temp = a[st];
			a[st] = a[ed];
			a[ed] = temp;
			st = st + 1;
			ed = ed - 1;
		}
		for(int i = 0; i < n; i++){
			if(i > 0) System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// expected: 1 4 5 3 2
		findZigZagSequence(new int[]{2, 3, 5, 1, 4}, 5);
		// expected: 1 2 3 7 6 5 4
		findZigZagSequence(new int[]{1, 2, 3, 4, 5, 6, 7}, 7);

	}
}
