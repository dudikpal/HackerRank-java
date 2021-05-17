package _30daysofcode.day10;

public class BinaryNumbers {

    public int solution(int n) {

        int count = 0;
        while (n > 0) {
            System.out.println(n);
            n = n & (n << 1);
            System.out.println(n);
            count++;
        }
        System.out.println(count);
        return count;
    }
}
