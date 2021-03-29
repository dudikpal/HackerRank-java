https://www.hackerrank.com/challenges/valid-pan-format/problem


### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args)  throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
         int numberOfLines = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile("^[A-Z]{5}\\d{4}[A-Z]$");
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(br.readLine());
            sb.append(SEPARATOR);
            if (m.matches()) {
                sb.append("YES");
            } else {
                sb.append("NO");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
    }
}
```