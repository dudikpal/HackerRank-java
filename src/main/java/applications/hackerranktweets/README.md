https://www.hackerrank.com/challenges/hackerrank-tweets/problem

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
        
        int numberOfLines = Integer.parseInt(br.readLine());
        Pattern p = Pattern.compile("(?i)\\bhackerrank");
        int counter = 0;
        while(br.ready()) {
            Matcher m = p.matcher(br.readLine());
            if (m.find()) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
```