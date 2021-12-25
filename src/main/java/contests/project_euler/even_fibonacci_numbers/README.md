https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem

## HackerRank version

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            
            long actual = 2;
        long prev = 1;
        List<Long> result = new ArrayList<>();
        while (actual < n) {
            if (actual % 2 == 0) {
                result.add(actual);
            }
            actual += prev;
            prev = actual - prev;
        }
        System.out.println(result.stream()
                .reduce(Long::sum)
                .get());
        }
    }
}
```