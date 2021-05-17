package _30daysofcode.day11;

import java.util.List;

public class _2DArrays {

    public int solution(List<List<Integer>> arr) {

        int sumMax = Integer.MIN_VALUE;
        if (arr.size() < 3) {
            return sumMax;
        }
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(0).size() - 2; j++) {
                int actualSum =
                        arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (actualSum > sumMax) {
                    sumMax = actualSum;
                }
            }
        }
        return sumMax;
    }
}
