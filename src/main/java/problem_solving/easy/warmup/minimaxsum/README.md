https://www.hackerrank.com/challenges/mini-max-sum/problem

## HackerRank version

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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
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
        System.out.println(sb.toString());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

```