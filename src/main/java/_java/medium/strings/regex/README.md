https://www.hackerrank.com/challenges/java-regex/problem

### HackerRank version

```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {

    
    
    String pattern = "^((([2][5][0-5])|([2][0-4]\\d)|([01]?\\d?\\d))\\.){3}(([2][5][0-5])|([2][0-4]\\d)|([01]?\\d?\\d))$";
    Pattern p = Pattern.compile(pattern);
       
    
}
```