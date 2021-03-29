https://www.hackerrank.com/challenges/hackerrank-language/problem

### HackerRank version

``` java
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) throws IOException  {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int numberOfLines = Integer.parseInt(br.readLine());
        String[] languagesString = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA: ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC".split("\\s*:\\s*");
        List<String> languages = Arrays.asList(languagesString);
        StringBuilder sb = new StringBuilder();
        String SEPARATOR = "";
        
        for (int i = 1; i <= numberOfLines; i++) {
            sb.append(SEPARATOR);
            if (languages.contains(br.readLine().split(" ")[1])) {
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