package _30daysofcode.day16;

public class ExceptionsStringToInteger {

    public int solution(String number) {

        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Bad String");
        }
    }
}
