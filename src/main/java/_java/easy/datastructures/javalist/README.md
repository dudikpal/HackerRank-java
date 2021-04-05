https://www.hackerrank.com/challenges/java-list/problem

### HackerRank version

```java
import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();
        LinkedList<String> numbers = new LinkedList<>();
        String[] numberArr = sc.nextLine().split("\\s");
        for (String number: numberArr) {
            numbers.add(number);
        }
        
        int numberOfQueries = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < numberOfQueries; i++) {
            String command = sc.nextLine();
            String[] query =  sc.nextLine().split("\\s");
            int index = Integer.parseInt(query[0]);
            if (command.equals("Insert")) {
                String value = query[1];
                numbers.add(index, value);
            } else {
                numbers.remove(index);
            }
        }

        System.out.println(numbers.toString().replace(",", "").replace("[", "").replace("]", ""));
    
    }
}
```