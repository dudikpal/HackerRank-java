package _30daysofcode.day3;

public class Conditional {

    public String solution(int n) {

        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            return "Weird";
        }

        return "Not Weird";
    }
}
