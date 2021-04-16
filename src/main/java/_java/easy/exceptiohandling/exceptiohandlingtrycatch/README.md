https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.util.InputMismatchException;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int operand1 = 0;
        int operand2 = 0;
        try (Scanner sc = new Scanner(System.in)){
            operand1 = sc.nextInt();            
            operand2 = sc.nextInt();
            
            System.out.println(operand1 / operand2);            
            
            } catch (InputMismatchException ime) {
                System.out.println(ime.getClass().getName());
            } catch (ArithmeticException ae) {
                System.out.println(ae);
            }
    }
}
```