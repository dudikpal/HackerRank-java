https://www.hackerrank.com/challenges/split-number/problem

### HackerRank version

```java
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
        Pattern p = Pattern.compile("^\\d{1,3}([-\\s])\\d{1,3}\\1\\d{4,10}$");
        
        for (int i = 1; i <= numberOfLines; i++) {
            String phoneNumber = br.readLine();
            Matcher m = p.matcher(phoneNumber);
            sb.append(SEPARATOR);
            if (m.matches()) {
                String[] parts = phoneNumber.split("-|\\s");
                sb.append("CountryCode=" + parts[0] + ",LocalAreaCode=" + parts[1] + ",Number=" + parts[2]);
            }
            SEPARATOR = "\n";
        }
        System.out.println(sb.toString());
    }
}
```