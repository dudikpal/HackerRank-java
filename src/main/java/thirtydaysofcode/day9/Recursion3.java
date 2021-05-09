package thirtydaysofcode.day9;

public class Recursion3 {

    public int solution(int n) {

        if (n == 1) {
            return 1;
        }
        return n * solution(n - 1);
    }
}
