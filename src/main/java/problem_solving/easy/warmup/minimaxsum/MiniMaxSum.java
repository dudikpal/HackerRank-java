package problem_solving.easy.warmup.minimaxsum;

import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

    public String solution(List<Integer> arr) {

        arr.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        long min = arr.subList(0, arr.size() - 1).stream()
                .map(Long::valueOf)
                .reduce(Long::sum).get();
        long max = arr.subList(1, arr.size()).stream()
                .map(Long::valueOf)
                .reduce(Long::sum).get();
        sb.append(min)
                .append(" ")
                .append(max);
        return sb.toString();
    }
}
