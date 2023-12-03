package interviewpreparationkit.oneweekpreparationkit.day3;

public class MockTest {

	public static void main(String[] args) {

		System.out.println(palindromeIndex("aaab"));
		System.out.println("Expected: 3");
		System.out.println(palindromeIndex("baa"));
		System.out.println("Expected: 0");
		System.out.println(palindromeIndex("aaa"));
		System.out.println("Expected: -1");
		System.out.println(palindromeIndex("quyjjdcgsvvsgcdjjyq"));
		System.out.println("Expected: 1");
		System.out.println(palindromeIndex("fvyqxqxynewuebtcuqdwyetyqqisappmunmnldmkttkmdlnmnumppasiqyteywdquctbeuwenyxqxqyvf"));
		System.out.println("Expected: 25");
	}

	public static int palindromeIndex(String s) {
		// Write your code here
		StringBuilder sb = new StringBuilder(s);

		if (s.equals(sb.reverse().toString())) {
			return -1;
		}

		for (int i = 0; i < s.length() / 2; i++) {

			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				if (isPalindrome(new StringBuilder(s).deleteCharAt(i).toString())) {
					return i;
				} else if (isPalindrome(new StringBuilder(s).deleteCharAt(s.length() - 1 - i).toString())) {
					return s.length() - 1 - i;
				}
			}
		}

		return -1;
	}

	private static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);

		return sb.toString().equals(sb.reverse().toString());
	}
}
