package _30daysofcode.day17;

public class MoreExceptions {

    public int solution(int number, int power) {

        if (number < 0 || power < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int)Math.pow(number, power);
    }
}
