package _30daysofcode.day5;

public class Loops {

    public String solution(int n) {

        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (int i = 1; i <= 10; i++) {
            sb.append(separator);
            sb.append(String.format("%d x %d = %d", n, i, n * i));
            separator = "\n";
        }
        return sb.toString();
    }
}
