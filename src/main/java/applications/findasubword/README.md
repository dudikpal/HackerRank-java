https://www.hackerrank.com/challenges/find-substring/problem

### HackerRank version

``` java
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args)  throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sentences = new StringBuilder();
        int index = 0;
        int lineOfSentence = Integer.parseInt(br.readLine().trim());
        
        for (int i = 1; i < lineOfSentence + 1; i++) {
            sentences.append(br.readLine().trim() + " ");
            index++;
        }
        int subWordsNumber = Integer.parseInt(br.readLine().trim());
        List<String> subStrings = new ArrayList<>();
        while (br.ready()) {
            subStrings.add(br.readLine());
            index++;
        }
        int counter = 0;
        Pattern p;
        StringBuilder result = new StringBuilder();
        for (String subWord : subStrings) {
            String pattern = "\\w+" + subWord + "\\w+";
            p = Pattern.compile(pattern);
                for (String word : sentences.toString().split("\\W+")) {
                    Matcher m = p.matcher(word);
                    if (m.find()) {
                        counter++;
                    }
                }
            result.append(counter + "\n");
            counter = 0;
        }
        System.out.println(result.toString());
    }
}
```