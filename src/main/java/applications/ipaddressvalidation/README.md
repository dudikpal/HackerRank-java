https://www.hackerrank.com/challenges/ip-address-validation/problem

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
        Pattern ipv4Pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Pattern ipv6Pattern = Pattern.compile("^(([a-f]|\\d){1,4}:?){8}$");
        Matcher m;
        StringBuilder sb = new StringBuilder();
        String separator = "";
        boolean isIPAddress = false;
        for (int i = 1; i <= numberOfLines; i++) {
            String line = br.readLine();
            m = ipv4Pattern.matcher(line);
            if (m.matches()) {
                sb.append(separator);
                sb.append("IPv4");
                isIPAddress = true;
            }
            m = ipv6Pattern.matcher(line);
            if (m.matches()) {
                sb.append(separator);
                sb.append("IPv6");
                isIPAddress = true;
            }
            if (!isIPAddress) {
                sb.append(separator);
                sb.append("Neither");
            }
            isIPAddress = false;
            separator = "\n";
        }
        
        System.out.println(sb.toString());
    }
}
```