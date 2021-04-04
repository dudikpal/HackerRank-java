https://www.hackerrank.com/challenges/java-negative-subarray/problem


### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        int counter = 0;
        for (int i = 0; i < numbers.size() ; i++) {
            for (int j = 0; j < numbers.size() - i; j++) {
                if (numbers.subList(i, i + j + 1).stream().mapToInt(x -> x).sum() < 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        
        
    }
}
```