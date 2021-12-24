package problem_solving.easy.warmup.birthday_cake_candles;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxValue = candles.stream()
                .max(Comparator.naturalOrder())
                .get()
                .intValue();

        return (int)candles.stream()
                .filter(num -> num == maxValue)
                .count();
    }
}
