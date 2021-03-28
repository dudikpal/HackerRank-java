https://www.hackerrank.com/challenges/alien-username/problem

### HackerRank version

``` java
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int numberOfLines = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile("^[_.]\\d+[a-zA-Z]*_?$");
        while (br.ready()) {
            Matcher m = p.matcher(br.readLine());
            sb.append(SEPARATOR);
            if (m.matches()) {
                sb.append("VALID");
            } else {
                sb.append("INVALID");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
    }
}
```