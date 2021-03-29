https://www.hackerrank.com/challenges/detecting-valid-latitude-and-longitude/problem

### HackerRank version

``` java
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args)  throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        int numberOfLines = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile("^\\([+-]?([0-9]0(\\.0+)?|([1-8]\\d|\\d)(\\.\\d+)?)\\s*,\\s*[+-]?(180(\\.0+)?|(1[0-7]\\d|\\d?\\d)(\\.\\d+)?)\\s*\\)$");
        for (int i = 1; i <= numberOfLines; i++) {
            Matcher m = p.matcher(br.readLine());
            sb.append(SEPARATOR);
            if (m.matches()) {
                sb.append("Valid");
            } else {
                sb.append("Invalid");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
    }
}
```