https://www.hackerrank.com/challenges/30-arrays/problem

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
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        Collections.reverse(arr);
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for (Integer number : arr) {
            sb.append(separator)
                .append(number);
            separator = " ";
        }        
        System.out.println(sb.toString());
    }
}

```