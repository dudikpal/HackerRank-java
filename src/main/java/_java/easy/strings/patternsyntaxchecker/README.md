https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

### HackerRank version

```java
import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code            
            
            try {
                Pattern.compile(pattern);                
                System.out.println("Valid");                
            } catch (PatternSyntaxException pse) {
                System.out.println("Invalid");                
            }        
            testCases--;
		}
	}
}
```