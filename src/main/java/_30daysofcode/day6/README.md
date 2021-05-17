https://www.hackerrank.com/challenges/30-review-loop/problem

### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int repeat = Integer.parseInt(sc.nextLine());
        for (int k = 0; k < repeat; k++) {
            String input = sc.nextLine();
            StringBuilder sbEven = new StringBuilder();
            StringBuilder sbOdd = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    sbEven.append(input.charAt(i));
                } else {
                    sbOdd.append(input.charAt(i));
                }
            }
            sbEven.append(" ");
            System.out.println( sbEven.toString() + sbOdd.toString());
        }
    }
}
```