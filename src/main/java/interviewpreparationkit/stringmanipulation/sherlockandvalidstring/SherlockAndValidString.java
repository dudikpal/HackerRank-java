package interviewpreparationkit.stringmanipulation.sherlockandvalidstring;

import java.util.*;

public class SherlockAndValidString {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        // Write your code here
        char[] sequences = s.toCharArray();
        Arrays.sort(sequences);
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char item: sequences) {
            frequencies.merge(item, 1, Integer::sum);
        }
        List<Integer> counters = new ArrayList<>(frequencies.values());
        counters.sort(Comparator.comparing(Integer::intValue));

        int min = Math.min(counters.get(0), counters.get(counters.size() - 1));
        int max = Math.max(counters.get(0), counters.get(counters.size() - 1));
        int maxFirstIndex = counters.indexOf(max);
        int maxLastIndex = counters.lastIndexOf(max);
        int minFirstIndex = counters.indexOf(min);
        int minLastIndex = counters.lastIndexOf(min); // abbccc  1,2,3
        counters.removeAll(new ArrayList<>(List.of(min, max)));
        if (min == max || (min == max - 1 && maxFirstIndex == maxLastIndex) || (min == 1 && minFirstIndex == minLastIndex) && counters.size() == 0) {
            return "YES";
        } else {
            return "NO";
        }

    }

    public static void main(String[] args) {
        SherlockAndValidString.isValid("abcdefghhgfedecba");
    }
}
