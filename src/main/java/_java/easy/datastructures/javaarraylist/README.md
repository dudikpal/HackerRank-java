https://www.hackerrank.com/challenges/java-arraylist/problem


### HackerRank version
```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
                
        int rowOfNumbers = Integer.parseInt(sc.nextLine());    
        
        List<String> lines = new ArrayList<>();        
        
        for (int i = 0; i < rowOfNumbers; i++) {
                lines.add(sc.nextLine());
        }        
        
        StringBuilder sb = new StringBuilder();
        String separator = "";
        int numberOfQueries = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < numberOfQueries; i++) {
            sb.append(separator);
            String query = sc.nextLine();
            int row = Integer.parseInt(query.split("\\s")[0]) - 1;
            int column = Integer.parseInt(query.split("\\s")[1]);
            if (lines.get(Integer.parseInt(query.split("\\s")[0]) - 1).split("\\s").length < 2
                || lines.get(row).split("\\s").length <= column) {
                sb.append("ERROR!");
            } else {
                sb.append(lines.get(row).split("\\s")[column]);
            }
            separator = "\n";
        }
        System.out.println(sb.toString());
        
    }
}
```