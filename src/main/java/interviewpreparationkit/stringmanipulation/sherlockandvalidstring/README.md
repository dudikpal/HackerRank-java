https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem

### HackerRank version

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

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
        counters.removeAll(new ArrayList<>(Arrays.asList(min, max)));
        if (min == max || (min == max - 1 && maxFirstIndex == maxLastIndex) || (min == 1 && minFirstIndex == minLastIndex) && counters.size() == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
```