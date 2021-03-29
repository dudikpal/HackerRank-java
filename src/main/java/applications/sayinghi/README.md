https://www.hackerrank.com/challenges/saying-hi/problem

### HackerRank version

``` java
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int numberOfLines = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        Pattern p = Pattern.compile("^[hH][iI]\\s[a-ce-zA-CE-Z].*$");
        for (int i = 1; i <= numberOfLines; i++) {
            String line = br.readLine().trim();
            Matcher m = p.matcher(line);
            if (m.matches()) {
                sb.append(SEPARATOR);
                sb.append(line);
                SEPARATOR = "\n";
            }            
        }
        System.out.println(sb.toString());
    }
}
```