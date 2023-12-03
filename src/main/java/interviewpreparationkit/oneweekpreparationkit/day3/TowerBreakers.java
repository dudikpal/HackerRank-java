package interviewpreparationkit.oneweekpreparationkit.day3;

public class TowerBreakers {

	public static void main(String[] args) {

		// expected: 2
		System.out.println(towerBreakers(2, 2));
		// ecpected: 1
		System.out.println(towerBreakers(1, 4));
	}

	public static int towerBreakers(int n, int m) {
		// Write your code here
		return n % 2 == 0 || m == 1 ? 2 : 1;
	}
}
