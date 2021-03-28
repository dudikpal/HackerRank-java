https://www.hackerrank.com/challenges/find-hackerrank/problem

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
        String zeroPointPattern = "^hackerrank$";
        String onePointPattern = "^hackerrank.*";
        String twoPointsPattern = ".*hackerrank$";
        
        
        while (br.ready()) {
            String line = br.readLine();
            Pattern zeroPattern = Pattern.compile(zeroPointPattern);
            Matcher zeroMatches = zeroPattern.matcher(line);
            Pattern onePattern = Pattern.compile(onePointPattern);
            Matcher oneMatches = onePattern.matcher(line);
            Pattern twoPattern = Pattern.compile(twoPointsPattern);
            Matcher twoMatches = twoPattern.matcher(line);
            sb.append(SEPARATOR);
            if (zeroMatches.matches()) {
                sb.append("0");
            } else if (oneMatches.matches()) {
                sb.append("1");
            } else if (twoMatches.matches()) {
                sb.append("2");
            } else {
                sb.append("-1");
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
    }
}
```