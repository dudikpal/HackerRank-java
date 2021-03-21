https://www.hackerrank.com/challenges/detect-html-tags/problem

HackerRank version

``` java
import java.io.*;
import java.util.*;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        
        
        String findedTags = "";
        int timeToProcess = Integer.parseInt(br.readLine().trim());
        TreeSet<String> uniqueTags = new TreeSet<>();
        while (br.ready()) {
            findedTags += htmlTags("(?<=</?)\\s*\\w+" ,br.readLine());
        }
        String[] tags = findedTags.split(" ");
        for (String str : tags) {
            uniqueTags.add(str.trim());
        }
        StringBuilder result = new StringBuilder();
        String SEPARATOR = "";
        for (String tag : uniqueTags) {
            result.append(SEPARATOR);
            result.append(tag);
            SEPARATOR = ";";
        }
        System.out.println(result.toString());
    }
    
    private static String htmlTags(String pattern, String testString) {
        String result = "";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testString);
        while (m.find()) {
            result += m.toMatchResult().group().trim() + " ";
        }
        return result;
    }
}
```