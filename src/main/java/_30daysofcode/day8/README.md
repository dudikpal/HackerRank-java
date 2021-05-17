https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

### HackerRank version

```java
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        StringBuilder sb = new StringBuilder();
        String separator = "";
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            sb.append(separator);
            if (phoneBook.containsKey(s)) {
                sb.append(s)
                        .append("=")
                        .append(phoneBook.get(s));
            } else {
                sb.append("Not found");
            }
            separator = "\n";
        }
        in.close();
        System.out.println(sb.toString());
    }
}
```