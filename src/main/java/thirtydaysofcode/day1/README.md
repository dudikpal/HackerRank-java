https://www.hackerrank.com/challenges/30-data-types/problem

### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        int a = Integer.parseInt(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        String str1 = scan.nextLine();
        a += i;
        b += d;
        s += str1;
        String result = a + "\n" + b + "\n" + s;
        System.out.println(result);
        scan.close();
    }
}
```