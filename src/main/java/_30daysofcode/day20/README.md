[https://www.hackerrank.com/challenges/30-sorting/problem](https://www.hackerrank.com/challenges/30-sorting/problem)

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



public class Solution {
    
    private static List<Integer> swap(List<Integer> input, int j) {
        int temp = input.get(j);
        input.set(j, input.get(j + 1));
        input.set(j + 1, temp);
        return input;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
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
        
        System.out.println(result);

        bufferedReader.close();
    }
}

```