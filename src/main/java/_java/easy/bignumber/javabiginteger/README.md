https://www.hackerrank.com/challenges/java-biginteger/problem

### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        BigInteger bigint1 = new BigInteger(sc.next());
        BigInteger bigint2 = new BigInteger(sc.next());
        
        System.out.println(bigint1.add(bigint2) + "\n" + bigint1.multiply(bigint2));
        
    }
}
```