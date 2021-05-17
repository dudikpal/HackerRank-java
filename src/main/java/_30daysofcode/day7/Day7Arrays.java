package _30daysofcode.day7;

import java.util.Collections;
import java.util.List;

public class Day7Arrays {

    public String solution(List<Integer> nums) {

        Collections.reverse(nums);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (Integer number : nums) {
            sb.append(separator)
                .append(number);
            separator = " ";
        }
        return sb.toString();
    }
}
