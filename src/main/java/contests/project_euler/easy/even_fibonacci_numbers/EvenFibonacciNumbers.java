package contests.project_euler.easy.even_fibonacci_numbers;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciNumbers {

    public long solution(long n) {

        long actual = 2;
        long prev = 1;
        List<Long> result = new ArrayList<>();
        while (actual < n) {
            if (actual % 2 == 0) {
                result.add(actual);
            }
            actual += prev;
            prev = actual - prev;
        }
        return result.stream()
                .reduce(Long::sum)
                .get();
    }
}
