https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem

## Project Euler #1: Multiples of 3 and 5
### HackerRank solution

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
        StringBuilder sb = new StringBuilder();
        String separator = "";
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt() - 1;
            long sum = 0;

            long three = n / 3;
            long five = n / 5;
            long fifteen = n / 15;
            sum = 3 * (three * (three + 1) / 2) + 5 * (five * (five + 1) / 2) - 15 * (fifteen * (fifteen + 1) / 2);
            sb.append(separator).append(sum);
            separator = "\n";
        }
        System.out.println(sb.toString());
    }
}
```