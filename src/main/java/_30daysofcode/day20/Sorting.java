package _30daysofcode.day20;

import java.util.List;

public class Sorting {

    public String solution(List<Integer> a) {

        int sumSwaps = 0;
        for (int i = 0; i < a.size(); i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < a.size() - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    swap(a, j);
                    numberOfSwaps++;
                }
            }
            sumSwaps += numberOfSwaps;
            if (numberOfSwaps == 0) {
                break;
            }
        }
        String result = String.format("Array is sorted in %d swaps.\n" +
                "First Element: %d\n" +
                "Last Element: %d", sumSwaps, a.get(0), a.get(a.size() - 1));
        return result;

    }

    private List<Integer> swap(List<Integer> input, int j) {
        int temp = input.get(j);
        input.set(j, input.get(j + 1));
        input.set(j + 1, temp);
        return input;
    }


}
