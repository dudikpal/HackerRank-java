https://www.hackerrank.com/contests/projecteuler/challenges/euler003/problem

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
            
        long max = 2;
        while (max <= Math.floor(Math.sqrt(n))) {
                if (n % max == 0) {
                    n /= max;
                } else {
                    max++;
                }
            }
        
        System.out.println(n);
        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    
    }

    
}

```