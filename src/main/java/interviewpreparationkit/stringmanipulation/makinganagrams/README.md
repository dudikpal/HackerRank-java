https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

### HackerRank version

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        StringBuilder longer = new StringBuilder();
        StringBuilder shorter = new StringBuilder();
        int deleteCounter = 0;
        if (a.length() > b.length()) {
            longer.append(a);
            shorter.append(b);
        } else {
            longer.append(a);
            shorter.append(b);
        }
        for (char item: longer.toString().toCharArray()) {
            int index = shorter.indexOf(String.valueOf(item));
            if (index > -1) {
                shorter.deleteCharAt(index);
                longer.deleteCharAt(longer.indexOf(String.valueOf(item)));
            }
        }
        deleteCounter = shorter.length() + longer.length();
        return deleteCounter;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
```